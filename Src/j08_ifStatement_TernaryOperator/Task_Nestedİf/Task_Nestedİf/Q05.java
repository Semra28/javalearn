package j08_ifStatement_TernaryOperator.Task_Nestedİf.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz : ");
        System.out.println("kilonuzu giriniz: ");
        int yas=scan.nextInt();
       int kilo= scan.nextInt();
        if (18<yas) {
            System.out.println("kan bağışı yapamaz");
        } if (yas> 18) {
                if (kilo < 10)
                    System.out.println("kan bağışı yapamaz");
                } if (yas> 18) {
            if (kilo > 10)
                System.out.println("kan bağışı yapabilir");
        }

    }

}
