package j08_ifStatement_TernaryOperator.ifStatementTasks.tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

      Scanner sc=new Scanner(System.in);
      double deger1=90.25;
      double deger2=90.25;
      if (deger1>deger2){
          System.out.println("Hello World");
      }else if (deger1<deger2){
          System.out.println("Not hello World");
      }else {
          System.out.println("I love java");
      }


    }
}
