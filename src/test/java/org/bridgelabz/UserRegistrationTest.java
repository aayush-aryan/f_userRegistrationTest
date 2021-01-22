package org.bridgelabz;

import org.junit.*;

public class UserRegistrationTest {
    UserRegistration userRegistration;
    public static final String firstNamePattern ="^[A-Z]{1}[a-z]{2,}";

    @Before
    public void setup(){
        userRegistration =new UserRegistration();
    }
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        try {
            String firstName = "Aayush";
            boolean userFirstName = userRegistration.validateUserFirstName(firstName);
            Assert.assertTrue(userFirstName);
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
    }

    @Test
    public void givenFirstName_startingWithSmallerLetter_shouldReturnFalse() {
        try {
            String firstName = "aayush";
            boolean userFirstName = userRegistration.validateUserFirstName(firstName);
            Assert.assertFalse(userFirstName);
        }catch (MyException myException){
            System.out.println(myException.getMessage());
        }

    }

    @Test
    public void givenFirstName_byLengthWhenInvalid_shouldReturnFalse(){
        String firstName="Aa";
        boolean userFirstName= false;
        try {
            userFirstName = userRegistration.validateUserFirstName(firstName);
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
        Assert.assertFalse(userFirstName);
    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue(){
        String lastName="Aryan";
        boolean userLastName= false;
        try {
            userLastName = userRegistration.validateUserLastName(lastName);
        } catch (MyException myException) {
            myException.printStackTrace();
        }
        Assert.assertTrue(userLastName);
    }

    @Test
    public void givenLastName_startingWithSmallerLetter_shouldReturnFalse(){
        String lastName="aryan";
        boolean userLastName= false;
        try {
            userLastName = userRegistration.validateUserLastName(lastName);
        } catch (MyException myException) {
            myException.printStackTrace();
        }
        Assert.assertFalse(userLastName);
    }
    @Test
    public void givenLastName_byLengthWhenInvalid_shouldReturnFalse() {
        String lastName = "Ar";
        boolean userLastName = false;
        try {
            userLastName = userRegistration.validateUserLastName(lastName);
        } catch (MyException myException) {
            myException.printStackTrace();
        }
        Assert.assertFalse(userLastName);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        String email = "abc.xyz@bl.co.in";
        boolean userEmail = true;
        try{
            userEmail = userRegistration.validateEmail(email);

        }catch (MyException myException){
           myException.printStackTrace();
        }
        Assert.assertTrue(userEmail);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnFalse() {
        String email = "567@bl";
        boolean userEmail = false;
        try{
            userEmail = userRegistration.validateEmail(email);

        }catch (MyException myException){
            myException.printStackTrace();
        }
        Assert.assertFalse(userEmail);
    }
    public void givenMobileNumberWithCountryCode_whenProper_shouldReturnTrue() {
        String mobileNumber="91-8356764578";
        boolean userMobileNumber = false;
        try {
            userMobileNumber = userRegistration.validateUserMobileNumber(mobileNumber);
        } catch (MyException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(userMobileNumber);
    }
    @Test
    public void givenMobileNumberWithoutCountryCode_whenInvalid_shouldReturnFalse() {
        String mobileNumber="8356764578";
        boolean userMobileNumber = false;
        try {
            userMobileNumber = userRegistration.validateUserMobileNumber(mobileNumber);
        } catch (MyException myexception) {
            myexception.printStackTrace();
        }
        Assert.assertFalse(userMobileNumber);
    }
    @Test
    public void givenMobileNumberLessThenTenDigit_whenInvalid_shouldReturnFalse() {
        String mobileNumber="91-356764578";
        boolean userMobileNumber = false;
        try {
            userMobileNumber = userRegistration.validateUserMobileNumber(mobileNumber);
        } catch (MyException myexception) {
            myexception.printStackTrace();
        }
        Assert.assertFalse(userMobileNumber);
    }

}
