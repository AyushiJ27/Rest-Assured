import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class Assgnmnt03 
{
     @Test
     public void asgmnt()
     {
    	 JSONObject req = new JSONObject();
         
         req.put("name", "Ayushi");
         req.put("loc", "Ngp");
         
         System.out.println(req);        
         System.out.println(req.toJSONString());
         
         given().
         header("Content Type", "application/json").
         contentType(ContentType.JSON).
         accept(ContentType.JSON).
         body(req.toJSONString()).
         when().
         post("https://reqres.in/api/users").
         then().
         assertThat().
         statusCode(201).
         log().all();
 
    
     }
}
