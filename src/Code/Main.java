package Code;
import Code.Rules.CommonPasswordRule;

import java.util.Scanner;

class Main{
    static Scanner input = new Scanner(System.in);
    static CommonPasswordRule commonPasswordRule = new CommonPasswordRule();
    public static void main(String args[]) {

        System.out.print("Enter a password:");
        String value = input.next();

        Password pwd = new Password(value);

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

        boolean commonPassword = commonPasswordRule.validate(pwd);
        System.out.println("Contains Common Password: "+commonPassword);
    }
}