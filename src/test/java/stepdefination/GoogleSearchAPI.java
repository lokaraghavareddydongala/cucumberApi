package stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.List;

public class GoogleSearchAPI {
	RequestSpecification rs;
	Response res;
	
	@Before
	public void setup() {
		RestAssured.baseURI = "http://216.10.245.166";
	}
	
	@After
	public void tearDown() {
		
	}
	@Given("Query Parameter and key")
	public void query_Parameter_and_key(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
	    rs =given().queryParam("key", data.get(0).get(0)).queryParam("query",data.get(0).get(1));
	}

	
	@When("hitting the google rsource server")
	public void hitting_the_google_rsource_server(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		res=rs.when().get(data.get(0).get(0));
	}

	@Then("status code should be {int}")
	public void status_code_should_be(Integer int1) {
		
	   
	}

	@Then("status line should be HTTP\\/{double} {int} OK")
	public void status_line_should_be_HTTP_OK(Double double1, Integer int1) {
		
	}
	@Then("status line should be HTTP\\/{double} {int} Not Found")
	public void status_line_should_be_HTTP_Not_Found(Double double1, Integer int1) {
		
	}

}
