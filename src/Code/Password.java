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
        return false;
    }

    boolean containsPattern(){
        return false;
    }

}
