package Files;

public class payload {

	public static String basics() {
		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Brindavan Nilaya\",\r\n"
				+ "  \"phone_number\": \"(+91) 7760287566\",\r\n" + "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n" + "    \"Training Institute\",\r\n" + "    \"Home\"\r\n" + "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "";
	}

	public static String Courses() {
		return "{\r\n" + "  \"dashboard\": {\r\n" + "    \"purchaseAmount\": 1390,\r\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\r\n" + "  },\r\n" + "  \"courses\": [\r\n" + "    {\r\n"
				+ "      \"title\": \"Selenium Python\",\r\n" + "      \"price\": 50,\r\n" + "      \"copies\": 6\r\n"
				+ "    },\r\n" + "    {\r\n" + "      \"title\": \"Cypress\",\r\n" + "      \"price\": 40,\r\n"
				+ "      \"copies\": 4\r\n" + "    },\r\n" + "    {\r\n" + "      \"title\": \"RPA\",\r\n"
				+ "      \"price\": 45,\r\n" + "      \"copies\": 10\r\n" + "    },\r\n" + "     {\r\n"
				+ "      \"title\": \"REST API\",\r\n" + "      \"price\": 48,\r\n" + "      \"copies\": 10\r\n"
				+ "    }\r\n" + "  ]\r\n" + "}";
	}

}
