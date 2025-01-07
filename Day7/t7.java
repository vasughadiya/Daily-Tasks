import java.util.*;

class t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number A : ");
        int a = sc.nextInt();
        System.out.print("Enter second number B : ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A = " + a + " B = " + b);
    }
}

// nirbhay.n@mvclouds.com