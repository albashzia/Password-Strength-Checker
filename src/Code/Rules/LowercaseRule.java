package Code.Rules;

import Code.Password;

public class LowercaseRule extends PasswordRule{

    String password;
    LowercaseRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    boolean validate(Password password) {
        for (int i = 0; i < password.getValue().length(); i++){
            for(char c = 'a'; c <= 'z'; c++){
                if(password.getValue().charAt(i) == c ){
                    return true ;
                }
            }
        }
        return false;
    }
}
