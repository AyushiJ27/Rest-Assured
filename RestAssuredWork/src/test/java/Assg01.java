import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Assg01 
{
    @Test
    public void Assgmnt()
    {
        given().
        when().
        get("https://reqres.in/api/users?page=2").
        then().
        assertThat().
        statusCode(equalTo(200));
    }
}
