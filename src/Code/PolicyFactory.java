package Code;

//Creates policies based on user choice

import Code.Rules.*;

public class PolicyFactory {

    void createBasicPolicy(Password password){
        DigitRule digitRule = new DigitRule();
        LengthRule lengthRule = new LengthRule();
        UppercaseRule uppercaseRule = new UppercaseRule();
        LowercaseRule lowercaseRule = new LowercaseRule();

    };
    void createIntermediatePolicy(Password password){
        DigitRule digitRule = new DigitRule();
        LengthRule lengthRule = new LengthRule();
        UppercaseRule uppercaseRule = new UppercaseRule();
        LowercaseRule lowercaseRule = new LowercaseRule();
        CommonPasswordRule commonPasswordRule = new CommonPasswordRule();
        SpecialCharacterRule specialCharacterRule = new SpecialCharacterRule();
    };
    void createStrongPolicy(){};
    void createAdvancedPolicy(){};
}
