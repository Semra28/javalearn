package j11_MethodCreation;

import java.util.Scanner;

public class Method_Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = sc.nextInt();

        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = sc.nextInt();

        System.out.println(esitKontrol(sayi1,sayi2));//true -false 23=23
        System.out.println(esitKontrol(3,5));//false
        System.out.println(esitKontrol (33,33)); //true
        esitkontrol(56,67);//agam sayılar eşit değil
        esitkontrol(sayi1,sayi2);//23=23-> agam sayilar eşit :


    } //main sonu
    private static boolean esitKontrol (int sayi1, int sayi2) {
        boolean esitMi = false;
        if (sayi1 == sayi2) {
            esitMi = true;
        } else esitMi = false;

        return esitMi;


        }
public static void esitkontrol (int a, int b ) {
    if (a == b) {
        System.out.println("agam sayilar EŞİT");
    }else System.out.println("agam sayilar eşit değil");
}
}