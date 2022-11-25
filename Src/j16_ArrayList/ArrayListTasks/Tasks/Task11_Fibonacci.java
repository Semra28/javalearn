package j16_ArrayList.ArrayListTasks.Tasks;


import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("bir tam sayı giriniz: ");
         int grlnsyi=scan.nextInt();
         ArrayList<Integer>fibonacci= new ArrayList<Integer>();
         int sayi1=1;
         int sayi2=1;
         int smr;
         fibonacci.add(sayi1);
         while(sayi2<grlnsyi){
             fibonacci.add(sayi2);
             smr=sayi2;
             sayi2=sayi1+sayi2;
             sayi1=smr;
             System.out.println(fibonacci);
         }

     }}
