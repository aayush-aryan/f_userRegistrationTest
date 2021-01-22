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

}
