package j08_ifStatement_TernaryOperator;


import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */

       // Scanner sc = new Scanner(System.in);
        //System.out.println("agam bir sayı gir: ");
       // int not = sc.nextInt();
       // if (not < 0 || not > 100) {
        //    System.out.println("agam negatif  ve 100 den büyük olmaz\n adam gibi bişeyler gir:\n" + "gelmim oraya");
        //} else if (not < 50) {//50 den küçük not alma kontrolu
       // } else if (not < 60) {//60 den kucuk not alma kontrolu
            //     System.out.println("C");
            // }else if (not<80){//80 den kucuk not alma kontrolu
            //     System.out.println("B");//60,61,...79
            // }else {//80 ve buyuk    not alma kontrolu
            //     System.out.println("A");//80,81...1000
       // }
        //ugur bey code :)


        Scanner sc=new Scanner(System.in);
        System.out.println("bebegim bir sayı gir:");
        int not=sc.nextInt();
        if (not<0|| not >100){

            System.out.println(" bebegim negatif ve 100 den büyük olmaz \n güzel  bişeyler gir:\n" + "getirme beni oraya");
        } else if(not<50) {
            System.out.println("D");
        }else if (not<60) {

        System.out.println("C");
    }      else if (not<80){

        System.out.println("B");
    }else{
        System.out.println("A");
    }



        }
    }

