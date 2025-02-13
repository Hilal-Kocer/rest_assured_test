import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class testOtomasyon {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testStatusCode() {
        given()
                .when()
                .get("/posts")
                .then()
                .statusCode(200);

    }


    @Test
    public void testJsonStructure() {
        given()
                .when()
                .get("/posts")
                .then()
                .body("$", not(empty()))
                .body("[0]", hasKey("userId"))
                .body("[0]", hasKey("id"))
                .body("[0]", hasKey("title"))
                .body("[0]", hasKey("body"));
    }

    @Test
    public void testSpecificPostTitle() {
        Response response = given()
                .when()
                .get("/posts/1")
                .then()
                .extract()
                .response();

        String title = response.jsonPath().getString("title");
        Assert.assertNotNull(title);
        System.out.println("Title of post 1: " + title);
    }

    @Test
    public void testMinimumListSize() {
        given()
                .when()
                .get("/posts")
                .then()
                .body("size()", greaterThanOrEqualTo(10));
    }

    @Test
    public void testUserIdValues() {
        Response response = given()
                .when()
                .get("/posts")
                .then()
                .extract()
                .response();

        List<Integer> userIds = response.jsonPath().getList("userId");
        for (int id : userIds) {
            Assert.assertTrue(id > 0, "UserID should be a positive number.");
        }
    }
}
