import java.util.*;

public class t16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dices : ");
        int n = sc.nextInt();
        System.out.print("Enter outcome of the roll : ");
        int roll = sc.nextInt();
        System.out.println("Number of combinations : " + result(n, roll));
        sc.close();
    }

    public static int result(int n, int sum) {
        if (n < 1 || n > 6) {
            throw new IllegalArgumentException("Number of dies must be between 1 and 6");
        }
        if (sum < n || sum > 6 * n) {
            return 0;
        }
        return comb(n, sum);
    }

    public static int comb(int left, int sum) {
        if (left == 1) {
            return (sum >= 1 && sum <= 6) ? 1 : 0;
        }
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            if (sum - i >= 0) {
                count += comb(left - 1, sum - i);
            }
        }
        return count;
    }
}
