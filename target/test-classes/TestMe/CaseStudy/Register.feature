@tag
Feature: Registration
 This is for Registration.

  @tag1
  Scenario: Successful Registration
    Given User enters the registration page
    And clicks the Sign-up button
    Given User Name in the User Name "Madhu1735478" Field
    And first name in the First Name "katemal" Field
    And last name in the Last Name "priyan" Field
    And Password in the password "1234" Field
    And Confirm Password in the Confirm Password "1234" Field
    And Gender in the Gender "Male" Field
    And E -Mail in the E -Mail "madhu16menon@gmail.com" Field
    And Mobile Number in the Mobile Number "9876543210" 
    And DOB in the DOB Field
    And Address in the Address "Velachey" Field
    And Security Question in the Security Question field
    And Answer in the Answer "Velachery" Field 
    And Click on Register button
      Then Home page is displayed
    
    
    
    
     
      