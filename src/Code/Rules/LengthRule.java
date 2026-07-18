package Code.Rules;

import Code.Password;

public class LengthRule extends PasswordRule{

    private final int minLength = 8;

    LengthRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }


    @Override
    boolean validate(Password password) {
        return false;
    }
}
