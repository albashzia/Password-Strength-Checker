package Code;
import Code.Rules.CommonPasswordRule;
import Code.Rules.DigitRule;
import Code.Rules.LengthRule;
import Code.Rules.LowercaseRule;

import java.io.DataInput;
import java.util.Scanner;

class Main{
    static Scanner input = new Scanner(System.in);
    static CommonPasswordRule commonPasswordRule = new CommonPasswordRule("Common Password Rule","Error in CommonPasswordRule class");
    static DigitRule digitRule = new DigitRule("Digit Rule","Error in DigitRule class");
    static LengthRule lengthRule = new LengthRule("Length Rule", "Error in LengthRule class");
    static LowercaseRule lowercaseRule = new LowercaseRule("Lower Case Rule","Error in LowercaseRule class");
    public static void main(String args[]) {

        System.out.print("Enter a password:");
        String value = input.next();

        Password pwd = new Password(value);

        boolean upper = pwd.containsUppercase();
        System.out.println("Contains Upper case letter: "+upper);

        boolean lower = lowercaseRule.validate(pwd);
        System.out.println("Contains Lower case letter: "+lower);


        boolean specialChar = pwd.containsSpecialChar();
        System.out.println("Contains Special Character: "+specialChar);

        boolean pattern = pwd.containsPattern();
        System.out.println("Contains Pattern: "+pattern);

        boolean length = lengthRule.validate(pwd);
        System.out.println("Satisfies Length Requirement: "+length);

        boolean digit = digitRule.validate(pwd);
        System.out.println("Contains a digit: "+digit);

        boolean commonPassword = commonPasswordRule.validate(pwd);
        System.out.println("Contains Common Password: "+commonPassword);
    }
}