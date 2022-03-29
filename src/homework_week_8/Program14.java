/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

package homework_week_8;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        diamond(); // calling method
    }

    public static void diamond() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of rows for triangle : ");
        int n = sc.nextInt();
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.println("*");
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.println("");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.println("*");
            }
            System.out.println();
            i--;
        }

    }
}


