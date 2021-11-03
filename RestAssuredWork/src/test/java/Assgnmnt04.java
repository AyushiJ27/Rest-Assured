import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class Assgnmnt04
{
     @Test
      public void asgnmnt() 
     {
        given()
  	   .get("https://reqres.in/api/User/89")
  	   .then()
  	   .statusCode(404)
       .log()
       .all();
 		System.out.println("Negative response received");

     }
}


