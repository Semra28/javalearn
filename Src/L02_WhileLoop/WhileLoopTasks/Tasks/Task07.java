package L02_WhileLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int maksSayi = 0;
        System.out.println("5 adet sayıyı giriniz");
        while (count <= 5) {
            int SayiGiriş = scan.nextInt();
            maksSayi = Math.max(maksSayi, SayiGiriş);
            count ++;
        }System.out.println("Maksimum sayı = " + maksSayi);

     }
}
