package Code.Rules;

import Code.Password;

public class UppercaseRule extends PasswordRule{

    String password;
    UppercaseRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }

    public boolean hasUpperCase(String password) {
        boolean upperCase = false;

        for (int i = 0; i < password.length(); i++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                if (password.charAt(i) == c) {
                    upperCase = true;
                    return upperCase;
                }
            }
        }
        return upperCase;
    }

    @Override
    boolean validate(Password password) {
        return false;
    }
}
