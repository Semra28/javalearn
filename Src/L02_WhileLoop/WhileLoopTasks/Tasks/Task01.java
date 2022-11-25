package L02_WhileLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        int toplam = 0;
        Scanner scan=new Scanner((System.in));
        while (toplam <= 333) {
            System.out.println("Bir sayı giriniz : ");
            int num1 = scan.nextInt();
            toplam += num1;
            System.out.println("Girdiğiniz sayılar toplamı " + toplam);
        }
        System.out.println("Girdiğiniz sayılar toplamı 333 ü geçti. ");


        }




    }
