package Code;

//Creates policies based on user choice

import Code.Rules.*;

public class PolicyFactory {

    public PasswordPolicy createBasicPolicy(){
        PasswordPolicy policy = new PasswordPolicy("Basic");
        policy.addRule(new LengthRule());
        policy.addRule(new LowercaseRule());
        return policy;
    }

    public PasswordPolicy createIntermediatePolicy() {
        PasswordPolicy policy = new PasswordPolicy("Intermediate");
        policy.addRule(new LengthRule());
        policy.addRule(new UppercaseRule());
        policy.addRule(new LowercaseRule());
        policy.addRule(new DigitRule());
        policy.addRule(new CommonPasswordRule());
        return policy;
    }

    public PasswordPolicy createStrongPolicy(){
        PasswordPolicy policy = new PasswordPolicy("Strong");
        policy.addRule(new LengthRule());
        policy.addRule(new UppercaseRule());
        policy.addRule(new LowercaseRule());
        policy.addRule(new DigitRule());
        policy.addRule(new SpecialCharacterRule());
        policy.addRule(new RepeatedCharacterRule());
        policy.addRule(new SequentialPatternRule());
        return policy;
    }

    public PasswordPolicy createAdvancedPolicy() {
        PasswordPolicy policy = new PasswordPolicy("Advanced");
        policy.addRule(new LengthRule());
        policy.addRule(new UppercaseRule());
        policy.addRule(new LowercaseRule());
        policy.addRule(new DigitRule());
        policy.addRule(new SpecialCharacterRule());
        policy.addRule(new RepeatedCharacterRule());
        policy.addRule(new SequentialPatternRule());
        policy.addRule(new CommonPasswordRule());

        return policy;
    }
}
