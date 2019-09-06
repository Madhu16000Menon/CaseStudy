package TestMe.CaseStudy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Back {
	
	WebDriver driver;

@Given("User enters the homePage")
public void user_enters_the_homePage() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Madhu\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("user search for the product {string}")
public void user_search_for_the_product(String string) {
	driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("user clicks on the  search  buttonnn")
public void user_clicks_on_the_search_buttonnn() {
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("Add to carttt")
public void add_to_carttt() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("page navigates to Login page")
public void page_navigates_to_Login_page() {
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	 Assert.assertEquals(driver.getTitle(), "Login");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}
