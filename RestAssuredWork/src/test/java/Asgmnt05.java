import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Asgmnt05 
{
     @Test
     public void response()
     {
    	 baseURI = "https://reqres.in/api/users?page=2";
         given().
         param("first_name","Lindsay").
         get("/data").
         then().
         assertThat().
         statusCode(404).
         log().all();
    	 
     }
}
