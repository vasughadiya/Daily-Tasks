import java.util.Scanner;

public class t4_t11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        // TASK 4 : completed

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j == 0 || j == i || i == n-1) {
        // System.out.print("* ");
        // } else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 5 : completed

        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j < n; j++) {
        // if (i == n/2 || j == n/2) {
        // System.out.print("* ");
        // } else if (i < n/2) {
        // if (j == 1 || i == 1 && j > n/2) {
        // System.out.print("* ");
        // } else {
        // System.out.print("  ");
        // }
        // } else if (i > n/2) {
        // if (j == n-1 || i == n-1 && j < n/2) {
        // System.out.print("* ");
        // } else {
        // System.out.print("  ");
        // }
        // } else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 6 : completed

        // for (int i = 1; i <= n; i++) {
        // // if (i % 2 != 0) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print("  ");
        // }
        // if (i == 1 || i == n) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // } else {
        // for (int j = 1; j <= n; j++) {
        // if (j == 1 || j == n) {
        // System.out.print("*");
        // } else {
        // System.out.print("  ");
        // }
        // }
        // // }
        // }
        // System.out.println();
        // }

        // TASK 7 : completed

        // for (int i = 1; i < n*2; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1 || i == n || i == n*2-1) {
        //             if (j != 1 && j != n) {
        //                 System.out.print("* ");
        //             } else {
        //                 System.out.print("  ");
        //             }
        //         } else if (j == 1 || j == n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // TASK 8 : completed

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) {
        // System.out.print("  ");
        // }
        // for (int k = 1; k <= i; k++) {
        // if (k == 1 || k == i || i == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 9 : completed

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // // Top row and bottom row
        // if (j == 0 || j == n - 1) {
        // System.out.print("* ");
        // }
        // // Diagonal elements in the middle rows
        // else if (j == i || j == n - i - 1) {
        // System.out.print("* ");
        // }
        // // Spaces for other positions
        // else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 10 : completed

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j < n; j++) {
        // System.out.print("  ");
        // }
        // for (int k = 1; k <= (2 * i - 1); k++) {
        // if (k == 1 || k == (2 * i - 1) || i <= n) {
        // if (k % 2 == 0) {
        // System.out.print(" "+(i-1)+" ");
        // } else {
        // System.out.print('*');
        // }
        // } else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 11 : completed

        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j < n; j++) {
        // System.out.print("  ");
        // }
        // for (int k = 1; k <= (2 * i - 1); k++) {
        // if (k == 1 || k == (2 * i - 1) || i <= n) {
        // if (k % 2 == 0) {
        // System.out.print(" " + (i - 1) + " ");
        // } else {
        // System.out.print('*');
        // }
        // } else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i >= 1; i--) {
        // for (int j = n; j > i; j--) {
        // System.out.print("  ");
        // }
        // for (int k = (2 * i - 1); k >= 1; k--) {
        // if (k == 1 || k == (2 * i - 1) || i <= n) {
        // if (k % 2 == 0) {
        // System.out.print(" " + (i - 1) + " ");
        // } else {
        // System.out.print('*');
        // }
        // } else {
        // System.out.print("  ");
        // }
        // }
        // System.out.println();
        // }

    }
}