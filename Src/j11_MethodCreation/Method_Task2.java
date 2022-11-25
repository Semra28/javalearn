package j11_MethodCreation;

import java.util.Scanner;

public class Method_Task2 {
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
        System.out.println("adınızı giriniz: ");
        String ad= sc.next();

        System.out.println("soyadınızı giriniz: ");
        String soyad =sc. next();

        isimSoyisimHarfKontrol(ad,soyad);





    }

    private static void isimSoyisimHarfKontrol(String ad, String soyad) {

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad ="+ad+ " " +soyad);

    }
    private static String isimSoyisimHarfKontrol2(String ad, String soyad) { //return typle method
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        return ad + " " + soyad;


    }

}
