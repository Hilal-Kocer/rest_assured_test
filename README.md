# API Test Otomasyonu - Rest Assured

Bu proje, [JSONPlaceholder API](https://jsonplaceholder.typicode.com/) üzerinden API test otomasyonu gerçekleştirmek için Rest Assured kullanmaktadır. API'nin çeşitli endpoint'leri üzerinde TestNG ve Rest Assured ile yazılmış testler bulunmaktadır.

## Proje İçeriği

Bu projede aşağıdaki test senaryoları gerçekleştirilmektedir:

1. Status Code Testi: API'nin başarılı bir şekilde `200 OK` durum kodu döndürüp döndürmediğini kontrol eder.
2. JSON Yapısı Doğrulama: JSON çıktısının bir dizi (array) içerdiğini ve her bir gönderinin belirli alanlara (örneğin, `userId`, `id`, `title`, `body`) sahip olduğunu doğrular.
3. Belirli Bir Değerin Doğrulanması: Örneğin, `id` değeri `1` olan gönderinin `title` değerini doğrular.
4. Liste Uzunluğu Kontrolü: JSON dizisinin en az 10 öğe içerdiğini doğrular.
5. Dinamik Veri Kontrolleri: `userId` alanlarının pozitif tamsayılar olduğunu doğrular.

### Gerekli Araçlar

- Java JDK (Java 8 veya üstü)
- Maven (Bağımlılık yönetimi ve testlerin çalıştırılması için)
- IDE (IntelliJ IDEA, Eclipse vb.)

### Adım 1: Java ve Maven Kurulumu

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) kurulumu yapınız.
- [Maven](https://maven.apache.org/download.cgi) kurulumu yapınız.

### Adım 2: Proje Dosyasının İndirilmesi

GitHub repository'sini bilgisayarınıza klonlayın veya ZIP olarak indirin.

```bash
git clone https://github.com/Hilal-Kocer/rest-assured-test.git
cd rest-assured-tests
