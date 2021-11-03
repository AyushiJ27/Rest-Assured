import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class A08 
{
    @Test(dataProvider="DataforTest")
    public void req(String firstname, String lastname, int empid, String email)
    {
    	  JSONObject request=new JSONObject();
		  
		  request.put("first_name", firstname);
		  request.put("last_name", lastname);
		  request.put("empid", empid);
		  request.put("email", email);
		  
		  System.out.println(request);
		  
		  given().
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		  header("Content-Type","application/json").
		  body(request.toString()).
		  when(). 
		  post("https://reqres.in/api/users"). 
		  then(). 
		  statusCode(201).
		  log().
		  all();
		  
		  
	  }
	  @DataProvider(name="DataforTest")
	  public Object[][] dataforTest()
	  {
		  Object[][] data=new Object[2][4];
		  data[0][0]="Ayushi";
		  data[0][1]="Jambhulkar";
		  data[0][2]=8970;
		  data[0][3]="ayushijambhulkar@gmail.com";
		  data[1][0]="Kriti";
		  data[1][1]="Joshi";
		  data[1][2]=6789;
		  data[1][3]="kritijoshi@gmail.com";
		  return data;
    }
}
