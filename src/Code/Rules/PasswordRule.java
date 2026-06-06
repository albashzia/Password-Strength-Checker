// Abstract Class

package Code.Rules;

abstract class PasswordRule {
    private String ruleName;
    private String errorMessage;

    PasswordRule(String ruleName, String errorMessage){
        this.ruleName = ruleName;
        this.errorMessage = errorMessage;
    }

    String getRuleName(){
        return ruleName;
    }

    String getErrorMessage(){
        return  errorMessage;
    }
}
