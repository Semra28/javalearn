package j11_MethodCreation;

import java.util.Scanner;

public class Method_Task3 {
    public static void main(String[] args) {

        //Task-> girilen iki sayiyi seçilen dört işleme göre heaplayan method create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz: ");
        double sayi1 = sc.nextDouble();
        System.out.println("2.sayiyi giriniz: ");
        double sayi2 = sc.nextDouble();
        System.out.println("işleminizi giriniz: ");
        char islem = sc.next().charAt(0);
        islemMenu(islem, (int) sayi1, (int) sayi2);
    }//mainsonu

    public static void islemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x, y);
                break;
            case '-':
                cıkar(x, y);
                break;
            case '*':
                carp(x, y);
                break;
            case '/':
                bol(x, y);
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
        }
    }

    public static void topla(int a, int b) {
        System.out.println("a+b= " + (a + b));

    }

    public static void carp(int a, int b) {
        System.out.println("a*b = " + (a * b));
    }

    public static void cıkar(int a, int b) {
        System.out.println("a-b = " + (a - b));
    }

    public static void bol(int a, int b) {
        System.out.println("a/b = " + (a / b));
    }
}