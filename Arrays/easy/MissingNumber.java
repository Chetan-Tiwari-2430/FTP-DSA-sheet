public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;

        if (missing > 0) {
            System.out.println(missing);
        } else {
            System.out.println("No missing number");
        }
    }
}