package org.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static Pattern FIRST_NAME_PATTERN = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static Pattern LAST_NAME_PATTERN = Pattern.compile("^[A-Z][a-z]{2,}$");

    boolean isValid = false;
    public boolean validateUserFirstName(String firstName) throws MyException {
        isValid=FIRST_NAME_PATTERN.matcher(firstName).matches();
        if(!isValid){
            throw new MyException("FirstNameShouldStartsWithCapsLetter");
        }

        return isValid;
    }

    public boolean validateUserLastName(String lastName) throws MyException {
        isValid=LAST_NAME_PATTERN.matcher(lastName).matches();
        if(!isValid){
            throw new MyException("LastNameShouldStartsWithCapsLetter");
        }
        return isValid;
    }
}
