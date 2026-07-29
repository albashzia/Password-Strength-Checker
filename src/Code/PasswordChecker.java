package Code;

import Code.Rules.*;

public class PasswordChecker {
    CommonPasswordRule commonPasswordRule;
    DigitRule digitRule;
    LengthRule lengthRule;
    LowercaseRule lowercaseRule;
    SequentialPatternRule sequentialPatternRule;
    SpecialCharacterRule specialCharacterRule;
    UppercaseRule uppercaseRule;

    PasswordChecker(){
        commonPasswordRule = new CommonPasswordRule();
        digitRule = new DigitRule();
        lengthRule = new LengthRule();
        lowercaseRule = new LowercaseRule();
        sequentialPatternRule = new SequentialPatternRule();
        specialCharacterRule = new SpecialCharacterRule();
        uppercaseRule = new UppercaseRule();
    }

    public boolean[] checkPassword(Password password){
        boolean[] result = new boolean[8];

        result[0] = commonPasswordRule.validate(password);
        result[1] = digitRule.validate(password);
        result[2] = lengthRule.validate(password);
        result[3] = lowercaseRule.validate(password);
        //result[4]
        result[5] = sequentialPatternRule.validate(password);
        //result[6]
        result[7] = uppercaseRule.validate(password);

        return result;
    }
}
