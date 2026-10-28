
public class Largest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 18};

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}
