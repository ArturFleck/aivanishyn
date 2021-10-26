package homework_15;

import java.util.HashMap;
import java.util.Map;

public class LoginUnit {

    private static String passCheck;
    private static Map<String, String> loginData = new HashMap<>(); // key - логин, value - пароль

    static {
        loginData.put("WhiteOcean", "qwe123456");
        loginData.put("dragula", "asdqwe123");
        loginData.put("ArturFleck", "_arturfleck");
        loginData.put("JohnDou", "123asdqwe");
        loginData.put("SunnyDayDream", "SunriceAvenue");
        loginData.put("Logan", "doDO_San");
    }

    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        boolean check = true;
        if (password.equals(confirmPassword)) {      // first of all we need to check if password and confirmPassword are matches
            throw new RuntimeException("Password and Confirm Password not match");   // if they not match we gonna throw some extension
        }
        try {
            isLoginValid(login);
            isPasswordValid(password);
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println("Something is wrong. " + ex.getMessage());
            check = false;
        }
        return check;
    }

    private static void isLoginValid(String login) throws WrongLoginException {
        if (login.length() > 20)
            throw new WrongLoginException("Login is too long.");
        if (!login.matches("^[a-zA-Z0-9_]+$"))
            throw new WrongLoginException("Login consist wrong characters.");
        if (!loginData.containsKey(login))  // if user not exist in our base
            throw new WrongLoginException("User not exist");

        passCheck = loginData.get(login);   // if user exist in base we take his value of password and throw it to isPasswordValid
        //System.out.println(loginData.containsKey(login));
    }

    private static void isPasswordValid(String password) throws WrongPasswordException {
        if (password.length() > 20 || password.length() == 0)
            throw new WrongPasswordException("Wrong length of password.");
        if (!password.matches("^[a-zA-Z0-9_]+$"))
            throw new WrongPasswordException("Password contains wrong characters.");
        if (passCheck.equals(password))      // if taken value that came from isLoginValid is not equals what user input
            throw new WrongPasswordException("Invalid password.");
        //System.out.println(loginData.containsValue(password));
    }

    static class WrongLoginException extends RuntimeException {
        // Parameterless Constructor
        public WrongLoginException() {
        }

        // Constructor that accepts a message
        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends RuntimeException {
        // Parameterless Constructor
        public WrongPasswordException() {
        }

        // Constructor that accepts a message
        public WrongPasswordException(String message) {
            super(message);
        }
    }

}