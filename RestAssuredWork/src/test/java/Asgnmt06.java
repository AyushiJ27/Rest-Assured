import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Asgnmt06 
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
         statusCode(201).
         log().
         all();
    }
}

