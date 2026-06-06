package Code.Rules;

import Code.Password;

public class LengthRule extends PasswordRule{

    @Override
    boolean validate(Password password) {
        return false;
    }
}
