package Code;

import Code.Rules.CommonPasswordRule;
import Code.Rules.DigitRule;

public class PasswordChecker {
    CommonPasswordRule commonPasswordRule;
    DigitRule digitRule;

    PasswordChecker(){
        commonPasswordRule = new CommonPasswordRule();
        digitRule = new DigitRule();
    }

    public boolean[] checkPassword(Password password){
        boolean[] result = new boolean[8];

        result[0] = commonPasswordRule.validate(password);

        return result;
    }
}
