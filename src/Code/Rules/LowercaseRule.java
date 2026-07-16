package Code.Rules;

import Code.Password;

public class LowercaseRule extends PasswordRule{

    String password;
    LowercaseRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }

    public boolean hasLowerCase(String password){
        boolean lowerCase = false;

        for (int i = 0; i < password.length(); i++){
            for(char c = 'a'; c <= 'z'; c++){
                if(password.charAt(i) == c ){
                    lowerCase = true;
                    return lowerCase;
                }
            }
        }
        return lowerCase;
    }

    @Override
    boolean validate(Password password) {
        return false;
    }
}
