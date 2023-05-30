package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει θερμοκρασιες Fahrenheit
 * σε Celcius.
 */

public class CelciusApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celcius = 0;
        int fahrenheit = 0;

        System.out.println("Please provide temp in fahrenheit");
        fahrenheit = in.nextInt();

        celcius = 5 *(fahrenheit - 32) / 9;

        System.out.printf("%d°F = %d°C");

    }
}
