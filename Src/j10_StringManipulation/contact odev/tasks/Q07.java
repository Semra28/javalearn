import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("kızım bir cumle giriniz: ");
        String cumle = sc.nextLine();

        System.out.println("aramak istediğiniz kelimeyi giriniz");
        String aranacakkelime= sc.nextLine();

        String s = cumle.contains(aranacakkelime) == true ? "aradığınız kelime cümlede var" : "aradığınız kelimede cümlede bulunmamaktadır";

        System.out.println("Aramanızın sonucu : "+s);



    }
}