package Day03;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yas bilgisi alarak






         */

        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz: ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("yasiniz oy kullanmaya uygun");
            if (age >= 70) {
                System.out.println("uc kez oy kullanabilirsiniz");
            } else if (age >= 50) {
                System.out.println("iki kez oy kullanabilirsiniz");
            } else {
                System.out.println("bir kez oy kullanabilirsiniz");


            }


        }
    }}
