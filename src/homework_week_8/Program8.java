/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

package homework_week_8;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = reader.nextInt(); // enter number for loop

        for(int i = 1; i <= num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("@"); // Print @ until loop is over
            }
            System.out.println();
        }
    }
}
