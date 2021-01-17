import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoWebShopTests {

    @Test
    void subscribeNewsletter() {
        String url = "http://demowebshop.tricentis.com/subscribenewsletter";
        String body = "email=test@test.com";
        String contentType = "application/x-www-form-urlencoded; charset=UTF-8";
        int statusCode = 200;

        NewsletterReponse response = given()
                .body(body)
                .contentType(contentType)
                .when()
                .post(url)
                .then()
                .statusCode(statusCode)
                .extract()
                .as(NewsletterReponse.class);

        assertTrue(response.isSuccess());
    }
}
