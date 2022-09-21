import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ZippoTest {

    @Test
    public void test1(){
        given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().statusCode(200);
    }
}
