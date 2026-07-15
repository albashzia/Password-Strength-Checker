package Code.Rules;

import Code.Password;

public class DigitRule extends PasswordRule{

    String password;
    public DigitRule(String ruleName, String errorMessage, String password){
        super(ruleName,errorMessage);
        this.password = password;
    }

    public boolean containsDigit(String password){
        boolean hasDigits = false;
        for (int i = 0; i < password.length(); i++){
            for(int j = 0; j <=9; j++){
                if (password.contains(Integer.toString(j))){
                    hasDigits = true;
                    return hasDigits;
                }
                else hasDigits = false;
            }
        }
        return hasDigits;
    }

    @Override
    boolean validate(Password password) {
        return false;
    }
}
