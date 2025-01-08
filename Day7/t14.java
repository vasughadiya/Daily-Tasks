import java.io.*;
import java.util.*;

public class t14 {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int ii = 0; ii < message.length(); ii++) {
            int charPosition = alpha.indexOf(message.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter the String for Encryption : ");
        message = sc.next();
        System.out.print("Enter Shift Key : ");
        key = sc.nextInt();
        System.out.println("Original msg : " + message);
        System.out.println("Encrpyted msg : " + encrypt(message, key));
    }
}