import java.util.Arrays;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.err.println("Second Largest Number : " + secondLargest);
    }
}
