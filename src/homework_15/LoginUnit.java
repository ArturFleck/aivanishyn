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
        loginData.put("Logan", "asdqdddas");
    }

    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        boolean check = true;

        isLoginValid(login);
        isPasswordValid(password);
        if (passCheck == password){
            check= false;
        }
        return check;
    }

    private static void isLoginValid(String login) {
        //System.out.println(loginData.containsKey(login));
        passCheck = loginData.get(login);

    }

    private static void isPasswordValid(String password) {
        System.out.println(loginData.containsValue(password));
    }
}