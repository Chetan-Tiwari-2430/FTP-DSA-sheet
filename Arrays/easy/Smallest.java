
public class Smallest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 18};

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
    }
}
