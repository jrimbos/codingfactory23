package gr.aueb.cf.exercises;

public class GetMaxPosition {

    public static void main(String[] args) {
            int[] arr = { 1, 5, 3, 8, 2 };
            int maxPos = getMaxPosition(arr, 0, arr.length - 1);
        System.out.println("The position of the maximum element in the array is: " + maxPos);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int max = arr[low];
        int pos = low;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos = i;
            }
        }
        return pos;
    }
}