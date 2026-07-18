package Code.Rules;

import Code.Password;

public class RepeatedCharacterRule extends PasswordRule{

    public RepeatedCharacterRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    public boolean validate(Password password) {
        return false;
    }
}
