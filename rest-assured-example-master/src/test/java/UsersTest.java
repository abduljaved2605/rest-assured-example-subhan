import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UsersTest extends TestBase {

    //The simplest case of Rest-Assured Usage: simple get and status code verification
   @Test
    public void shouldFetchListOfAllUsers() {

       given().when().get("https://www.google.com").then().statusCode(200);
    }



}
