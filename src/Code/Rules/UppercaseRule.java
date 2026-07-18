package Code.Rules;

import Code.Password;

public class UppercaseRule extends PasswordRule{

    public UppercaseRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }


    @Override
    public boolean validate(Password password) {
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
