package Code.Rules;

import Code.Password;

public class LengthRule extends PasswordRule{

    private int minLength;

    LengthRule(String ruleName, String errorMessage, int minLength){
        super(ruleName,errorMessage);
        this.minLength = minLength;
    }
    @Override
    boolean validate(Password password) {
        return false;
    }
}
