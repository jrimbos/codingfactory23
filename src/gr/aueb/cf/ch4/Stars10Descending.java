package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10,9,8, ...., 1
 * αστεράκι(α) σε κάθε γραμμή
 * ξεκινώντας απο τη 1η γραμμή.
 */
public class Stars10Descending {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
