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

    public void addRule(PasswordRule rule) {
        rules.add(rule);
    }

    public String getPolicyName() {
        return policyName;
    }

    public ArrayList<PasswordRule> getRules() {
        return rules;
    }
}