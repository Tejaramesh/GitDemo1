import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import Files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Addplace {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").body(payload.basics())
				.header("Content-Type", "application/json").when().post("maps/api/place/add/json").then().assertThat()
				.statusCode(200).body("scope", equalTo("APP")).body("status", equalTo("OK"))
				.header("Content-Type", "application/json;charset=UTF-8").extract().response().asString();

		System.out.println(response);

		JsonPath js = new JsonPath(response);

		String placeId = js.get("place_id");
		String st = js.getString("status");
		System.out.println(st);
		System.out.println(placeId);

//update place
		String newAddress = "Summer walk, Africa";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}")
				.when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

//get place

		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
				.response().asString();

		JsonPath js1 = new JsonPath(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);

	}
}