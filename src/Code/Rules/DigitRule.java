package Code.Rules;

import Code.Password;

public class DigitRule extends PasswordRule{

    String password;
    public DigitRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }



    @Override
    boolean validate(Password password) {
        return false;
    }
}
