// Abstract Class

package Code.Rules;

import Code.Password;

abstract class PasswordRule {
    private String ruleName;
    private String errorMessage;

    PasswordRule(String ruleName, String errorMessage){
        this.ruleName = ruleName;
        this.errorMessage = errorMessage;
    }

    abstract boolean validate(Password password);

    String getRuleName(){
        return ruleName;
    }

    String getErrorMessage(){
        return  errorMessage;
    }
}
