package L02_WhileLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
       Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int num1= scan.nextInt();
        System.out.println("Bir sayı Daha giriniz: ");
        int num2=scan.nextInt();
        for (int i=Math.min(num1,num2)+1; i<Math.max (num1,num2); i++){
            System.out.println(i +"  ");
        }
        System.out.println();
        int min=((num1<num2) ?  num1: num2 ) +1;
        int max=(num1>num2) ? num1:num2;
        while (min<max){
            System.out.println(min +"  ");
         min++;
        }
    }
}
