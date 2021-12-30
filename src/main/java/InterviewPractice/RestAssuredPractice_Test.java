package InterviewPractice;

import com.google.common.annotations.VisibleForTesting;
import io.restassured.RestAssured;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class RestAssuredPractice_Test {
    @BeforeTest
    public void endPointURI()
    {
        RestAssured.baseURI="https://reqres.in//";
    }
    @Test
    public void get()
    {

        //RestAssured.given().when().get("api/users/2").then().assertThat().statusCode(200);
        given().when().get("api/users/259").then().log().all();


    }

}
