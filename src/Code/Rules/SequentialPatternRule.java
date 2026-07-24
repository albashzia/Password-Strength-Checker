package Code.Rules;

import Code.Password;

public class SequentialPatternRule extends PasswordRule{

    public SequentialPatternRule(){

    }

    public SequentialPatternRule(String ruleName, String errorMessage){
        super(ruleName,errorMessage);
    }

    @Override
    public boolean validate(Password password) {
        String value = password.getValue();

        String pattern1 = "0123456789";
        for (int i = 0; i < pattern1.length(); i++){
            for (int j = i+3; j <= pattern1.length(); j++){
                String sub = pattern1.substring(i,j);
                if (value.contains(sub)){
                    return true;
                }
            }
        }

        String pattern2 = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < pattern2.length(); i++){
            for (int j = i+3; j <= pattern2.length(); j++){
                String sub = pattern2.substring(i,j);
                if (value.contains(sub)){
                    return true;
                }
            }
        }

        String pattern3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < pattern3.length(); i++){
            for (int j = i+3; j <= pattern3.length(); j++){
                String sub = pattern3.substring(i,j);
                if (value.contains(sub)){
                    return true;
                }
            }
        }
        return false;
    }
}
