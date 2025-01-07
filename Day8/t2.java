import java.util.Arrays;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();

        char[] chr = new char[n];

        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            chr[i] = scanner.next().charAt(0);
        }

        System.out.println("Original array: " + Arrays.toString(chr));

        for (int i = 0; i < chr.length - 1; i++) {
            for (int j = 0; j < chr.length - 1 - i; j++) {
                if (chr[j] > chr[j + 1]) {
                    char temp = chr[j];
                    chr[j] = chr[j + 1];
                    chr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(chr));

        scanner.close();
    }
}