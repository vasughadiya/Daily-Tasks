import java.util.Scanner;

public class t10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        System.out.println("Enter the position of the word you want:");
        int n = sc.nextInt();

        String[] splited = s.split(" ");

        if (n > 0 && n <= splited.length) {
            System.out.println("The word at position " + n + " is: " + splited[n - 1]);
        } else {
            System.out.println("Invalid position.");
        }
    }
}
