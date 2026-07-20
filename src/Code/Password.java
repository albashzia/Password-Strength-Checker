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

     public String getValue(){
        return value;
    }

}
