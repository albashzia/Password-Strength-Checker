package Code;

import Code.Rules.CommonPasswordRule;

public class PasswordChecker {
    CommonPasswordRule commonPasswordRule;
    PasswordChecker(){
        commonPasswordRule = new CommonPasswordRule();
    }

    public boolean[] checkPassword(Password password){
        boolean[] result = new boolean[8];

        result[0] = commonPasswordRule.validate(password);

        return result;
    }
}
