package Code.Rules;

import Code.Password;

public class UppercaseRule extends PasswordRule{

    String password;
    UppercaseRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }


    @Override
    boolean validate(Password password) {
        for (int i = 0; i < password.getValue().length(); i++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                if (password.getValue().charAt(i) == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
