package reqresApi;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;
import restfulbookerApi.Specifications;

import java.util.List;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;


public class ReqresApiTest {
    private final String URL_API = "https://reqres.in/";

    @Test
    public void checkEmails(){
        Specifications.installSpecification(restfulbookerApi.Specifications.requestSpec(URL_API), Specifications.responseSpecOK200());
            List<UserData> emails = given()
                .when()
                .contentType(ContentType.JSON)
                .get("api/users?page=2")
                .then()
                .extract().body().jsonPath().getList("data", UserData.class);
            emails.forEach(x-> Assert.assertTrue(x.getEmail().contains("@")));

            Assert.assertTrue(emails.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));
    }
}
