package restfulbookerApi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertTrue;


public class BookingTest {

    private final String URl = "https://restful-booker.herokuapp.com";

    @Test
    public void BookingId() {
        Specifications.installSpecification(Specifications.requestSpec(URl), Specifications.responseSpecOK200()); //Извлекает все ИД книг в список
        List<BookingData> booking = given()
                .when()
                .get("/booking")
                .then()
                .extract().body().jsonPath().getList("", BookingData.class);

        List<BookingData> first10 = booking.stream().limit(10).collect(Collectors.toList());//Получаем первые 10 ИД книг в список
    }

}
