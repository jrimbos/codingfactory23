package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Typecast from String to int.
 */
public class TypeCastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Lexeme;
        int num;

        System.out.println("Please insert a num (int)");
        Lexeme = in.next();
        num = Integer.parseInt(Lexeme);

        System.out.println("Num is " + num);
    }
}
