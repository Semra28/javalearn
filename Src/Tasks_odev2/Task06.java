package Tasks2;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner input= new Scanner(System.in);
        System.out.println("Birinci dik kenar uzunluğunu giriniz");
        int dik1=input.nextInt();
        System.out.println("İkinci dik kenar uzunluğu giriniz");
        int dik2= input.nextInt();
        System.out.println("hipotenüs: "+ (dik1*dik1+dik2*dik2));






    }


}
