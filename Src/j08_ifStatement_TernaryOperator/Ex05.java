package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
  /*      Task-> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print ede code create ediniz.

      */


        Scanner sc =new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        double sayi1=sc.nextDouble();
        System.out.println("2. sayıyı giriniz: ");
        double sayi2=sc.nextDouble();
        System.out.println("+ için->1 seçiniz \n- için ->2 seçiniz \n * için ->3 seçiniz \n/ için ->4 seçiniz");
        int secim = sc.nextInt();


        if (secim ==1){
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");




    }
}
