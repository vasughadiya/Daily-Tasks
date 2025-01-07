import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 211, 13, 79, 11, 17 };

        // List numbers = new ArrayList();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter some numbers.");
        // while (scanner.hasNextInt()) {
        // int i = scanner.nextInt();
        // numbers.add(i);
        // }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            // checking if array contains an even integer
            if (arr[i] % 2 == 0) {
                System.out.println("Array contains an even integer");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Array does not contain any even integer");
        }
    }
}
