This Spring Boot app is build using Java 8

To start the app
1. mvn clean install
2. mvn spring-boot:run

To stop the app
1. Ctrl + C

To test the app
1. http://localhost:8080/api/qr?data=HelloWorld&size=200
2. http://localhost:8080/api/qr?data=https://google.com&size=250
3. To use in email template: <img src="http://localhost:8080/api/qr?data=#variable.encodedUrl#&size=200" />
4. Change the #variable.encodedUrl# accordingly

If using Java 8:

<properties>
    <java.version>1.8</java.version>
</properties>

AND Spring Boot must be:

<version>2.7.18</version>


If using Java 11:

<properties>
    <java.version>11</java.version>
</properties>

Spring Boot:

2.7.x (still OK)


If using Java 17

<properties>
    <java.version>17</java.version>
</properties>

Spring Boot:

3.x.x