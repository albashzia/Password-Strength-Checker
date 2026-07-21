package Code.Rules;

import Code.Password;

public class DigitRule extends PasswordRule{


    public DigitRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }


    @Override
    public boolean validate(Password password) {
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
