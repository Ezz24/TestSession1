import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostRequest {
    public static void main(String[] args) {
     Response res =   RestAssured.given()
                .baseUri("https://reqres.in/api/login")
                .header("Content-Type","application/json")
                .body(" {\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}\n  ")
                .when().post();
        int statusCode = res.then().extract().statusCode();
        String responseBody = res.then().extract().body().asPrettyString();
        JsonPath  path = res.jsonPath();
        String token = path.get("token");

        System.out.println("this is the token value: "+ token);

        res.then().statusCode(200);
        res.then().header("Content-Length","29");

        System.out.println(statusCode);
        System.out.println(responseBody);










    }
}
