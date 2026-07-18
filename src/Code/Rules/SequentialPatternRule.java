package Code.Rules;

import Code.Password;

public class SequentialPatternRule extends PasswordRule{


    @Override
    public boolean validate(Password password) {
        return false;
    }
}
