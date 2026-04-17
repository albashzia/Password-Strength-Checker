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
            if (value.charAt(index)<= 'A' && value.charAt(index)>='Z'){
                return true;
            }
        }
        return false;
    }

    boolean containsLowercase(){
        return false;
    }

    boolean containsDigit(){
        return false;
    }

    boolean containsSpecialChar(){
        return false;
    }

    boolean containsPattern(){
        return false;
    }

}
