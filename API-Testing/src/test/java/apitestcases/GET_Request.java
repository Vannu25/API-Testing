package apitestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GET_Request {
	@Test 
	 public void getuser() {
//		specifies the uri base
		RestAssured.baseURI="https://gorest.co.in/public/v1/users"; 
		
//		requesting an object
		 RequestSpecification httpRequest=RestAssured.given();
		 
//		 response to an object
		 Response response=httpRequest.request(Method.GET,"/50");
		 
		 String responseBody=response.getBody().asString();
		 System.out.println("Response body is:"+responseBody);
		 int statusCode=response.getStatusCode();
		 System.out.println("status code is :"+statusCode);
		 Assert.assertEquals(statusCode, 200); 
	}


}
