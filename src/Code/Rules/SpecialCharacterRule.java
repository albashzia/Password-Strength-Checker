package Code.Rules;

import Code.Password;

public class SpecialCharacterRule extends PasswordRule{

    public SpecialCharacterRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    public boolean validate(Password password) {
        return false;
    }
}
