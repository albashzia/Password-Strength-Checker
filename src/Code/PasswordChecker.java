package Code;

import Code.Rules.CommonPasswordRule;
import Code.Rules.DigitRule;
import Code.Rules.LengthRule;
import Code.Rules.LowercaseRule;

public class PasswordChecker {
    CommonPasswordRule commonPasswordRule;
    DigitRule digitRule;
    LengthRule lengthRule;
    LowercaseRule lowercaseRule;

    PasswordChecker(){
        commonPasswordRule = new CommonPasswordRule();
        digitRule = new DigitRule();
        lengthRule = new LengthRule();
        lowercaseRule = new LowercaseRule();
    }

    public boolean[] checkPassword(Password password){
        boolean[] result = new boolean[8];

        result[0] = commonPasswordRule.validate(password);
        result[1] = digitRule.validate(password);
        result[2] = lengthRule.validate(password);
        result[3] = lowercaseRule.validate(password);

        return result;
    }
}
