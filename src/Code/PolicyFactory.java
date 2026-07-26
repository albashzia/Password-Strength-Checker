package Code;

//Creates policies based on user choice

import Code.Rules.DigitRule;
import Code.Rules.LengthRule;
import Code.Rules.LowercaseRule;
import Code.Rules.UppercaseRule;

public class PolicyFactory {

    void createBasicPolicy(Password password){
        DigitRule digitRule = new DigitRule();
        LengthRule lengthRule = new LengthRule();
        UppercaseRule uppercaseRule = new UppercaseRule();
        LowercaseRule lowercaseRule = new LowercaseRule();

    };
    void createIntermediatePolicy(){};
    void createStrongPolicy(){};
    void createAdvancedPolicy(){};
}
