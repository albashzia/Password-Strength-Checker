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
        boolean hasDigits = false;
        for (int i = 0; i < password.getValue().length(); i++){
            for(int j = 0; j <=9; j++){
                if (password.getValue().contains(Integer.toString(j))){
                    hasDigits = true;
                    return hasDigits;
                }
                else hasDigits = false;
            }
        }
        return hasDigits;
    }
}
