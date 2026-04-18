package Code;

class Main{
    public static void main(String args[]) {
        Password pwd = new Password("@QWERTYuiopabcd");

        boolean upper = pwd.containsUppercase();
        System.out.println("Contains Upper case letter: "+upper);

        boolean lower = pwd.containsLowercase();
        System.out.println("Contains Lower case letter: "+lower);

        boolean digit = pwd.containsDigit();
        System.out.println("Contains a digit: "+digit);

        boolean specialChar = pwd.containsSpecialChar();
        System.out.println("Contains Special Character: "+specialChar);

        boolean pattern = pwd.containsPattern();
        System.out.println("Contains Pattern: "+pattern);
    }
}