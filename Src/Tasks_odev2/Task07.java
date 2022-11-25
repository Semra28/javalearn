package Tasks2;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner input= new Scanner(System.in);
        System.out.println("mesafeyi km olarak giriniz: ");
        int km= input.nextInt();
        System.out.println("hızı km/saat olarak giriniz");
        int kmsaat=input.nextInt();
        System.out.println("süre:"+(km/kmsaat)+"saattir.");





    }
}
