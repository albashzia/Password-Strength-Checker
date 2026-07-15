package Code.Rules;

import Code.Password;

public class DigitRule extends PasswordRule{

    public DigitRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    boolean validate(Password password) {
        return false;
    }
}
