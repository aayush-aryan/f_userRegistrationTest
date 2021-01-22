package org.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static Pattern FIRST_NAME_PATTERN = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static Pattern LAST_NAME_PATTERN = Pattern.compile("^[A-Z][a-z]{2,}$");
    private static Pattern EMAIL = Pattern.compile("^[\\w-_\\.?+]{2,}[\\w]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    private static Pattern PHONE_NUMBER =Pattern.compile("^[1-9]{2}[-][6-9][0-9]{9}$");

    boolean isValid = false;
    static boolean isValidEmail=false;
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

    public static boolean validateEmail(String email)throws MyException {
        isValidEmail = EMAIL.matcher(email).matches();
        if(!isValidEmail){
            throw new MyException("EmailFormatBeProper");
        }
        return isValidEmail;

    }
    public boolean validateUserMobileNumber(String mobileNumber)throws MyException {
        isValid=PHONE_NUMBER.matcher(mobileNumber).matches();
        if (!isValid){
            throw new MyException("giveProperPhoneNumber");
        }
        return isValid;
    }
}
