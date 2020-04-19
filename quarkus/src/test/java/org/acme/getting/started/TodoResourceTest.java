package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TodoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/todo")
          .then()
             .statusCode(200);
    }

}