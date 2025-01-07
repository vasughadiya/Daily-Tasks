import java.util.*;

public class t13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println("Enter R : ");
        int r = sc.nextInt();

        float combination = factorial(n)/((factorial(n-r))*factorial(r));
        float permutation = factorial(n) / (factorial(n - r));

        System.out.println(n + "C" + r + " = " + combination);
        System.out.println(n + "P" + r + " = " + permutation);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
