package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασιζει αν πρεπει να αναψουν τα φωτα
 * ενος αυτοκινητου με βαση τρεις μεταβλητες:
 * αν βρεχει ΚΑΙ ταυτοχρονα ισχυει ενα τουλαχιστον
 * απο τα επόμενα: ειναι σκοταδι Η' τρεχουμε
 * (speed > 100). Τις τιμες αυτες τις λαμβανουμε
 * απο τον χρηστη (stdin).
 */

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean LightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it Dark (true/false");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        LightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On: " + LightsOn);
    }
}
