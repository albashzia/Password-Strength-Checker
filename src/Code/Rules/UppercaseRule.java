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
        return false;
    }
}
