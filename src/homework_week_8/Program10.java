/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
package homework_week_8;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        // input number to check if its Armstrong number
        System.out.println(" Please enter a 3 digit number to find if its an Armstrong number: ");
        int number = new Scanner(System.in).nextInt();

        // printing result
        if (isArmStrong(number)) {
            System.out.println("Number : " + number + " is an Armstrong number");
        } else {
            System.out.println("Number : " + number + " is not an Armstrong number");
        }
    }
    /*
     * @ return true if number is Armstrong number or return false
     */

    public static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while (number != 0) {
            int remainder = number % 10;
            result = result + remainder * remainder * remainder;
            number = number / 10;
        }
        // number is Armstrong return true
        if (orig == result) {
            return true;
        }
        return false;
    }
}
