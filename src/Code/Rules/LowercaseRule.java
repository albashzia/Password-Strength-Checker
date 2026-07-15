package Code.Rules;

import Code.Password;

public class LowercaseRule extends PasswordRule{

    String password;
    LowercaseRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }


    @Override
    boolean validate(Password password) {
        return false;
    }
}
