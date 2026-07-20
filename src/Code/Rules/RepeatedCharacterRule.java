package Code.Rules;

import Code.Password;

public class RepeatedCharacterRule extends PasswordRule{

    public RepeatedCharacterRule(){

    }

    public RepeatedCharacterRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    public boolean validate(Password password) {

        for (int i = 0; i < password.getValue().length();i++){
            for (int j = 1; j < password.getValue().length()-1;j++){
                if(password.getValue().charAt(i) == password.getValue().charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
