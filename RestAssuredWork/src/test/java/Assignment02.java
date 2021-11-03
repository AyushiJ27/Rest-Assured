import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Assignment02 
{
   	@Test
	public void assgnmnt() 
   	{
   	
   		Response response = get("https://reqres.in/api/users?page=2");
   	    System.out.println(response.getBody());
  	    System.out.println(response.getStatusCode());
  	
   	}
     
     @Test
     void test_project()
     {
  	   given()
  	   .get("https://reqres.in/api/users?page=2")
  	   .then()
  	   .body("data.id[0]", equalTo(7))
  	   .statusCode(200)
  	   .log().all();
    }
}
