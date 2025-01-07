import java.util.*;
public class t15 {
    public static void main(String[] args) {
        System.out.print("Enter number to chack armstrong or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, count);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}