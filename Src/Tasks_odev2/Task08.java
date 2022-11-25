package Tasks2;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner input= new Scanner(System.in);
        System.out.println("vize1 notunu giriniz: ");
        int vize1= input.nextInt();
        System.out.println("vize2 notunu giriniz:");
        int vize2= input.nextInt();
        System.out.println("final notunu giriniz: ");
        int fınal= input.nextInt();

       double grade= (3*(vize1+vize2)/20)+(7*fınal/10);
        System.out.println("your is grade:" +grade);





    }
}
