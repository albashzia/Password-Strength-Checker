package Code.Rules;

import Code.Password;

public class LengthRule extends PasswordRule{

    private final int minLength = 8;

    public LengthRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }


    @Override
    public boolean validate(Password password) {
        if (password.getValue().length()>=minLength){
            return true;
        }
        return false;
    }
}
