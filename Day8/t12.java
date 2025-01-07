import java.util.Scanner;
public class t12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String input = sc.nextLine();
        String reversedString = reverseWords(input);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" "); 
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i != 0) {
                reversed += " ";
            }
        }
        return reversed;
    }
}
