package Code.Rules;

import Code.Password;

public class SequentialPatternRule extends PasswordRule{

    public SequentialPatternRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    public boolean validate(Password password) {
        return false;
    }
}
