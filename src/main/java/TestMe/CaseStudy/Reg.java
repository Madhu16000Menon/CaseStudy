package TestMe.CaseStudy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Reg {
	
	WebDriver driver;
	
	@Given("User enters the registration page")
	public void user_enters_the_registration_page() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Madhu\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
		   driver.manage().window().maximize();
	
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("clicks the Sign-up button")
	public void clicks_the_Sign_up_button() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Given("User Name in the User Name {string} Field")
	public void user_Name_in_the_User_Name_Field(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("first name in the First Name {string} Field")
	public void first_name_in_the_First_Name_Field(String string) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("last name in the Last Name {string} Field")
	public void last_name_in_the_Last_Name_Field(String string) {
		  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("Password in the password {string} Field")
	public void password_in_the_password_Field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("Confirm Password in the Confirm Password {string} Field")
	public void confirm_Password_in_the_Confirm_Password_Field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("Gender in the Gender {string} Field")
	public void gender_in_the_Gender_Field(String string) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("E -Mail in the E -Mail {string} Field")
	public void e_Mail_in_the_E_Mail_Field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("Mobile Number in the Mobile Number {string}")
	public void mobile_Number_in_the_Mobile_Number(String string) {
		 driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("DOB in the DOB Field")
	public void dob_in_the_DOB_Field() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[3]")).click();
	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[49]")).click();
	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[1]/a")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("Address in the Address {string} Field")
	public void address_in_the_Address_Field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("Security Question in the Security Question field")
	public void security_Question_in_the_Security_Question_field() {
		Select b=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
	    b.selectByIndex(0);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("Answer in the Answer {string} Field")
	public void answer_in_the_Answer_Field(String string) {
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("Click on Register button")
	public void click_on_Register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
