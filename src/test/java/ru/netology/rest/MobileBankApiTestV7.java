package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV7 {
    @Test
    void RUBAndUSD() {

        given()
                .baseUri("http://localhost:9999/api/v1")

                .when()
                .get("/demo/accounts")

                .then()
                .body("every {it.currency == 'RUB' || it.currency == 'USD'}", is (true));
    }
}