package Code.Rules;

import Code.Password;

public class SpecialCharacterRule extends PasswordRule{

    public SpecialCharacterRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    public boolean validate(Password password) {
        String value = password.getValue();
        for (int index = 0; index < value.length(); index++){
            if (
                    (((int) value.charAt(index) >= 33) &&
                            ((int) value.charAt(index) <= 47)) ||
                            (((int) value.charAt(index) >= 58) &&
                                    ((int) value.charAt(index) <= 64)) ||
                            (((int) value.charAt(index) >= 91) &&
                                    ((int) value.charAt(index) <= 96)) ||
                            (((int) value.charAt(index) >= 123) &&
                                    ((int) value.charAt(index) <= 126))
            )
            {
                return true;
            }
        }
        return false;
    }
}
