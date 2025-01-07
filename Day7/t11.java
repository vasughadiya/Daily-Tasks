import java.util.Scanner;

public class t11 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float n = sc.nextFloat();
        String input = String.valueOf(n);

        String[] parts = input.split("\\.");
        String intr = parts[0];

        String revint = new StringBuilder(intr).reverse().toString();
        String reversed = parts[1] + revint;

        int dot = input.indexOf('.');
        float output = Float.parseFloat(reversed.substring(0, dot) + "." + reversed.substring(dot));

        System.out.println("Input: " + n);
        System.out.println("Output: " + output);
    }
}
