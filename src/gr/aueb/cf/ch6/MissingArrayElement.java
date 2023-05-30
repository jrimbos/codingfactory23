package gr.aueb.cf.ch6;

public class MissingArrayElement {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        int missing = getMissing(arr);
        System.out.println("Missing number: " + missing);
    }

    public static int getMissing(int[] arr) {
        int n = arr.length;
        int sum = (n + 1) * (n + 2) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;
    }

}
