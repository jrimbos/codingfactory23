package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ενα αεροσκαφος εχει δυο δεξαμενες.
 * Αν μια δεξαμενη εχει λιγοτερο απο
 * 1/4 καυσιμα τοτε αναβει πορτοκαλι
 * σημα, ενω αν και οι δυο δεξαμενες
 * εχουν < 1/4 τοτε αναβει κοκκινο σημα.
 *
 * Ο πιλοτος (χρηστης) δινει true  ή false
 * ανάλογα αν tank < 1/4 ή οχι, αντιστοιχα.
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1 , tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);


    }
}
