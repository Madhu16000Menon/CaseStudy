package TestMe.CaseStudy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;

public class AddToCart {
	
	WebDriver driver;
	

	@Given("User clicks on th Login Buttonn")
	public void user_clicks_on_th_Login_Buttonn() {
		System.setProperty("webdriver.chrome.driver","C:\\Madhu\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user enters {string} in the Fieldd")
	public void user_enters_in_the_Fieldd(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("users enters {string} in the fieldd")
	public void users_enters_in_the_fieldd(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("click on  Loginn")
	public void click_on_Loginn() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user enters {string} in the search field")
	public void user_enters_in_the_search_field(String string) {
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Then("user clicks on the  search button")
	public void user_clicks_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	

	@Then("Add to cart")
	public void add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
