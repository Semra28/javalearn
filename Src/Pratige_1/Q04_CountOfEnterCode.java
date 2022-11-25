package Pratige_1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
        //STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin="semra12345";
        int girisHakki=4;
        Scanner scanner=new Scanner(System.in);
        System.out.println("*****Hoşgeldin Semra*****");

        while (true){
            System.out.println("Pin kodunu giriniz:");
            String girilenPin=scanner.nextLine();

            if(pin.equals(girilenPin)) {
                System.out.println("Başarılı giriş yaptiniz...");
                break;
            }else {
                System.out.println("Yanlış giriş yaptınız...");
                girisHakki--;
                System.out.println("kalan giris Hakkiniz: " + girisHakki);

            }if(girisHakki==0){
                System.out.println("giriş hakkınız kalmadı... sim kartiniz bloke oldu..");
                break;
            }
        }

    }

}
