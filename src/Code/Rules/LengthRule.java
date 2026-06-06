package Code.Rules;

import Code.Password;

public class LengthRule extends PasswordRule{

    LengthRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);

    }
    @Override
    boolean validate(Password password) {
        return false;
    }
}
