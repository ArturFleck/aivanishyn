package homework_15;

import java.util.HashMap;
import java.util.Map;

public class LoginUnit {

    private static Map<String, String> loginData = new HashMap<>();
        static{
            loginData.put("WhiteOcean","qwe123456");
            loginData.put("drakula","asdqwe123");
        }
        static boolean isUserAuthentic(String login, String password, String confirmPassword){
            isLoginValid(login);
            isPasswordValid(password);
            return false;
        }
        private static void isLoginValid(String login){

        }

        private static void isPasswordValid(String password){

        }

}
