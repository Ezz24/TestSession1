import io.restassured.RestAssured;

public class GetRequest {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://reqres.in/api/users?page=2")
                .when()
                .get()
                .then()
                .statusCode(200);



    }

}
