package Tasks2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner input= new Scanner(System.in);
        System.out.println("40 yılda kaç saat uyuyorsunuz: ");
        double uyku= input.nextInt();

 System.out.println("Ayda: " + (uyku/24)*30 + ", Yılda:  " + (int)((uyku/24)*365) + ", 40 Yılda: " + (int)((uyku/24)*365*40) + " gününüz uykuda geçiyor !!!!" );











    }
}
