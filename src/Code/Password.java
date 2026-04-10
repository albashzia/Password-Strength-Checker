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
        return 0;
    }

    boolean containsUppercase(){
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
