package Day10.random;

import java.util.Random;
import java.util.Scanner;

public class C02_MathClassMatrix {
    public static void main(String[] args) {
    /*
Ask user to enter a number and print on console number by number matrix.

Example:
Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/

            Scanner scanner = new Scanner(System.in);
            System.out.println("matrisin boyutunu giriniz");
            int sayi = scanner.nextInt();

            Random random= new Random();
            for (int i = 0; i < sayi; i++) { //outer for - satir
                for (int j = 0; j < sayi; j++) { //inner for - sutun
                    // System.out.print((int) (Math.random()*2) + " ");
                    System.out.print(random.nextInt(2) + " ");
                }
                System.out.println();
            }





    }
}
