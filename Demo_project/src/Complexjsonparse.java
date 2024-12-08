import Files.payload;
import io.restassured.path.json.JsonPath;

public class Complexjsonparse {

	public static void main() {
		JsonPath js = new JsonPath(payload.Courses());
		// Print No of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);
		// Print Purchase Amount
		int amount = js.getInt("dashboard.purchaseAmount");
		System.out.println(amount);
		// Print Title of the first course

		String firsttittle = js.getString("courses[0].title");
		System.out.println(firsttittle);
//Print All course titles and their respective Prices
		for (int i = 0; i < count; i++) {
			String coursetitles = js.get("courses[" + i + "].title");
			int prices = js.get("courses[" + i + "].price");
			System.out.println(coursetitles);
			System.out.println(prices);
		}

		System.out.println("PRINTING NO OF COPIES SOLD BY RPA COURSE");

		for (int i = 0; i < count; i++) {
			String titles = js.getString("courses[" + i + "].title");
			if (titles.equalsIgnoreCase("REST API")) {
				System.out.println(js.get("courses[" + i + "].price").toString());
				break;
			}
		}

//Verify if Sum of all Course prices matches with Purchase Amount
		int sumprice = 0;
		for (int i = 0; i < count; i++) {
			int coprice = js.get("courses[" + i + "].price");
			int copies = js.get("courses[" + i + "].copies");
			int toprice = coprice * copies;
			sumprice = toprice + sumprice;
		}
		System.out.println(sumprice);
		int puamount = js.get("dashboard.purchaseAmount");
		System.out.println(puamount);
		if (sumprice == puamount) {
			System.out.println("All course prices matches with purchase amount");
		} else {
			System.out.println("Course price and purchase amount does not match");
		}

	}
}
