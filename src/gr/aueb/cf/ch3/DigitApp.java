package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το πληθος των ψηφιων
 * και το αθροισμα του πρωτου και του τελευταιου
 * ψηφιου.
 * π.χ. 531 -> count: 3, sum 9, Leftmost + rightMost: 6
 */

public class DigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightmost = 0;
        int leftmost = 0;

        System.out.println("Please insert num (int");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            currentDigit = num % 10;
            sum += currentDigit;

            num = num/ 10;
        } while (num != 0);

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
    }
}
