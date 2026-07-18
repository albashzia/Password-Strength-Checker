package Code.Rules;

import Code.Password;

public class RepeatedCharacterRule extends PasswordRule{


    @Override
    public boolean validate(Password password) {
        return false;
    }
}
