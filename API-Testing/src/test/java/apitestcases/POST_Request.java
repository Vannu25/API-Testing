package apitestcases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request {
	@Test 
	 void postuser() {
		RestAssured.baseURI="https://gorest.co.in/public/v1/users";
		 RequestSpecification httpRequest=RestAssured.given();
		 
		 JSONObject requestParams=new JSONObject();
   	 requestParams.put("id","101");
		 
   	 requestParams.put("user_id",201);
		 requestParams.put("title","female");
		 requestParams.put("body","inactive");
		 
		 httpRequest.header("Content-Type","application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response=httpRequest.request(Method.POST,"");
		 
		 
		 
		 String responseBody=response.getBody().asString();
		 
		 System.out.println("Response body is:"+responseBody);
		 int statusCode=response.getStatusCode();
		 System.out.println("status code is :"+statusCode);
		 Assert.assertEquals(statusCode, 201); 
	}

}


