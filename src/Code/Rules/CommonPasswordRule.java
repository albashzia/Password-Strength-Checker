package Code.Rules;

import Code.Password;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonPasswordRule extends PasswordRule{

    ArrayList<String> commonPasswords = new ArrayList<>();


    public CommonPasswordRule() {

    }

    private void loadCommonPasswords() {
        try {
            String data = Files.readString(Path.of("Resources/common_passwords.txt"));

            for (String password : data.split(",")) {
                commonPasswords.add(password.trim());
            }

        } catch (IOException e) {
            System.out.println("Could not read common_passwords.txt");
        }
    }

    public CommonPasswordRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }


    @Override
    public boolean validate(Password password) {
        for (int i = 0; i < commonPasswords.size();i++){
            if (commonPasswords.get(i).equalsIgnoreCase(password.getValue())){
                return true;
            }
        }
        return false;
    }
}
