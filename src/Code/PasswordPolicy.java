package Code;

import Code.Rules.PasswordRule;

import java.util.ArrayList;

public class PasswordPolicy {
    private String policyName;
    private ArrayList<PasswordRule> rules;


    public PasswordPolicy(String policyName) {
        this.policyName = policyName;
        this.rules = new ArrayList<>();
    }

}