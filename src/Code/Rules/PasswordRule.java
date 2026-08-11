// Abstract Class

package Code.Rules;

import Code.Password;

public abstract class PasswordRule {
    private String ruleName;
    private String errorMessage;

    public PasswordRule(){

    }

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
