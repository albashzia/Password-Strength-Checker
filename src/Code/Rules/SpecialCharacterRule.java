package Code.Rules;

import Code.Password;

public class SpecialCharacterRule extends PasswordRule{

    @Override
    public boolean validate(Password password) {
        return false;
    }
}
