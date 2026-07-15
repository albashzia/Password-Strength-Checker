package Code.Rules;

import Code.Password;

public class LowercaseRule extends PasswordRule{



    @Override
    boolean validate(Password password) {
        return false;
    }
}
