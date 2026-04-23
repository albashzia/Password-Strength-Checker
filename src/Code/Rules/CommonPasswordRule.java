package Code.Rules;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonPasswordRule extends PasswordRule{

    ArrayList<String> commonPasswords = new ArrayList<>(Arrays.asList(
            "123456",
            "123456789",
            "12345678",
            "12345",
            "1234567",
            "password",
            "password123",
            "admin",
            "admin123",
            "qwerty",
            "qwerty123",
            "abc123",
            "111111",
            "123123",
            "000000",
            "iloveyou",
            "welcome",
            "monkey",
            "login",
            "letmein",
            "football",
            "dragon",
            "master",
            "sunshine",
            "ashley",
            "bailey",
            "shadow",
            "superman",
            "harley",
            "password1",
            "trustno1",
            "hello",
            "freedom",
            "whatever",
            "qazwsx",
            "starwars",
            "passw0rd",
            "654321",
            "7777777",
            "1q2w3e4r",
            "zaq12wsx",
            "google",
            "facebook",
            "youtube",
            "linkedin",
            "admin@123",
            "root",
            "toor",
            "guest",
            "test",
            "user",
            "default"
    ));

    CommonPasswordRule(ArrayList<String> commonPasswords){
        this.commonPasswords = commonPasswords;
    }
}
