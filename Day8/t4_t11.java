import java.util.Scanner;

public class t4_t11 {
    public static void main(String[] args) {

        // TASK 4 : completed

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // if (j == 0 || j == i || i == 4) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println(" ");
        // }

        // TASK 5 : completed

        // for (int i = 1; i < 10; i++) {
        // for (int j = 1; j < 10; j++) {
        // if (i == 5 || j == 5) {
        // System.out.print("* ");
        // } else if (i < 5) {
        // if (j == 1 || i == 1 && j > 5) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // } else if (i > 5) {
        // if (j == 9 || i == 9 && j < 5) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 6 : completed

        // for (int i = 1; i <= 9; i++) {
        // if (i % 2 != 0) {
        // for (int j = 1; j <= 9 - i; j++) {
        // System.out.print(" ");
        // }
        // if (i == 1 || i == 9) {
        // for (int j = 1; j <= 9; j++) {
        // System.out.print("*");
        // }
        // } else {
        // for (int j = 1; j <= 9; j++) {
        // if (j == 1 || j == 9) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // }
        // System.out.println();
        // }

        // TASK 7 : completed

        // for (int i = 1; i < 10; i++) {
        // for (int j = 1; j < 6; j++) {
        // if (i == 1 || i == 5 || i == 9) {
        // if (j == 2 || j == 3 || j == 4) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // } else if (j == 1 || j == 5) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 8 : completed

        // for (int i = 1; i <= 5; i++) {
        // for (int j = i; j <= 5; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // if (k == 1 || k == i || i == 5) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 9 : completed

        // for (int i = 0; i < 9; i++) {
        // for (int j = 0; j < 9; j++) {
        // // Top row and bottom row
        // if (j == 0 || j == 9 - 1) {
        // System.out.print("* ");
        // }
        // // Diagonal elements in the middle rows
        // else if (j == i || j == 9 - i - 1) {
        // System.out.print("* ");
        // }
        // // Spaces for other positions
        // else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 10 : completed

        // for (int i = 1; i <= 5; i++) {
        // for (int j = i; j < 5; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= (2 * i - 1); k++) {
        // if (k == 1 || k == (2 * i - 1) || i <= 5) {
        // if (k % 2 == 0) {
        // System.out.print(" "+(i-1)+" ");
        // } else {
        // System.out.print('*');
        // }
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // TASK 11 : completed

        // for (int i = 1; i <= 5; i++) {
        // for (int j = i; j < 5; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= (2 * i - 1); k++) {
        // if (k == 1 || k == (2 * i - 1) || i <= 5) {
        // if (k % 2 == 0) {
        // System.out.print(" " + (i - 1) + " ");
        // } else {
        // System.out.print('*');
        // }
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = 4; i >= 1; i--) {
        // for (int j = 5; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = (2 * i - 1); k >= 1; k--) {
        // if (k == 1 || k == (2 * i - 1) || i <= 5) {
        // if (k % 2 == 0) {
        // System.out.print(" "+(i-1)+" ");
        // } else {
        // System.out.print('*');
        // }
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

    }
}