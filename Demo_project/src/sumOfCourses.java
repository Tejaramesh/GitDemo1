import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Files.payload;
import io.restassured.path.json.JsonPath;

public class sumOfCourses {

	@Test
	public void sum() {
		int sumvalue = 0;
		JsonPath js = new JsonPath(payload.Courses());
		int count = js.getInt("courses.size()");
		for (int i = 0; i < count; i++) {
			int prices = js.getInt("courses[" + i + "].price");
			int copieces = js.getInt("courses[" + i + "].copies");
			int amount = prices * copieces;
			System.out.println(amount);
			sumvalue = sumvalue + amount;
		}
		int purchaseamount = js.getInt("dashboard.purchaseAmount");
		AssertJUnit.assertEquals(sumvalue, purchaseamount);
		System.out.println(sumvalue);
	}

}
