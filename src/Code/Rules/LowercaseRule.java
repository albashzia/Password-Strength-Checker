package Code.Rules;

import Code.Password;

public class LowercaseRule extends PasswordRule{

    String password;
    LowercaseRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }

    public boolean hasLowerCase{
        boolean lowerCase = false;

        for (int i = 0; i < password.length(); i++){

        }

        return lowerCase;
    }

    @Override
    boolean validate(Password password) {
        return false;
    }
}
