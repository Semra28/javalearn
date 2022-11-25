package Tasks2;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Banka hesabınız Var mı?: varsa TRUE yoksa FALSE giriniz");
        boolean birbankahesabı = input.nextBoolean();
        System.out.println("Girilen birbankahesabı: " + birbankahesabı);






    }
}