package org.bridgelabztest;
import org.bridgelabz.MyException;
import org.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;
    public static final String firstNamePattern ="^[A-Z][a-z]{2,}";

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

}
