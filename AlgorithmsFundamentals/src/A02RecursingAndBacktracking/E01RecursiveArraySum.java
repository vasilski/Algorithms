package A02RecursingAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class E01RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = sumNumbers(numbers, 0);
        System.out.println(sum);

    }
    public static int sumNumbers(int [] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumNumbers(arr, index + 1);
    }
}
