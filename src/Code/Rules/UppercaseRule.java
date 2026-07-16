package Code.Rules;

import Code.Password;

public class UppercaseRule extends PasswordRule{


    @Override
    boolean validate(Password password) {
        return false;
    }
}
