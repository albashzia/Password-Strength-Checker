package Code;

class Main{
    public static void main() {
        Password pwd = new Password("QWERTYuiop1234");

        boolean upper = pwd.containsUppercase();
        System.out.println("Contains Upper case letter: "+upper);

        boolean lower = pwd.containsLowercase();
        System.out.println("Contains Lower case letter: "+lower);

        boolean digit = pwd.containsDigit();
        System.out.println("Contains a digit: "+digit);
    }
}