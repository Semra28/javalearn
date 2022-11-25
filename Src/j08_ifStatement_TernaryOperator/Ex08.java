package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
     /* Task->Kullanicidan bir sayi alin

Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
Eger 10 dan buyuk ise "Buyuksun!" yazdirin
Eger 10 dan kucuk ise "Normalsin!" yazdirin

Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
Eger -10 dan buyuk ise "Negatifsin!" yazdirin
Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir sayı gir: ");
        int sayi= sc.nextInt();
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("bebeğim bir sayı giriniz");
        int sayı = sc.nextInt();

        if (sayı > 0) {
            if (sayı > 10) {
                System.out.println("Buyuksun!");
            } else  {
                System.out.println("Normalsin");

            }
        } else  {
            if (sayı > -10) {
                System.out.println("Negatifsin");
            } else if (sayı < -10) {
                System.out.println("Çok Negatifsin biraz tebessüm");
            }
        }





    }
}
