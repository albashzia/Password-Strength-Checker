package Code;

public class Password {
    private String value;

    Password(){
        value = "!QWERTYasdfg1234";
    }

    Password(String value){
        this.value = value;
    }
    void setValue(String value){
        this.value = value;
    }

    String getValue(){
        return value;
    }

    int getLength(){
        return value.length();
    }

    boolean containsUppercase(){
        for (int index = 0; index < value.length(); index++){
            if (value.charAt(index)>= 'A' && value.charAt(index)<='Z'){
                return true;
            }
        }
        return false;
    }

    boolean containsLowercase(){
        for (int index = 0; index < value.length(); index++){
            if (value.charAt(index)>= 'a' && value.charAt(index)<='z'){
                return true;
            }
        }
        return false;
    }

    boolean containsDigit(){
        for (int index = 0; index < value.length(); index++){
            if (value.charAt(index)>= '0' && value.charAt(index)<='9'){
                return true;
            }
        }
        return false;
    }

    boolean containsSpecialChar(){
        for (int index = 0; index < value.length(); index++){
            if (
                    ((int)value.charAt(index)>=33 &&
                     (int)value.charAt(index)<=47) ||
                    ((int)value.charAt(index)>=58 &&
                     (int)value.charAt(index)<=64) ||
                    ((int)value.charAt(index)>=91 &&
                     (int)value.charAt(index)<=96) ||
                    ((int)value.charAt(index)>=123 &&
                     (int)value.charAt(index)<=126)
            )
            {
                return true;
            }
        }
        return false;
    }

    boolean containsPattern(){
        String pattern1 = "0123456789";

        for (int i = 0; i < pattern1.length(); i++){
            for (int j = 1+1; j <= pattern1.length(); j++){
                String sub = pattern1.substring(i,j);
                if (value.contains(sub)){
                    return true;
                }
            }
        }

        String pattern2 = "abcdefghijklmnopqrstuvwxyz";
        String pattern3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        return false;
    }

}
