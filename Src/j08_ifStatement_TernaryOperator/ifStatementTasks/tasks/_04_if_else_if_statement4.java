package j08_ifStatement_TernaryOperator.ifStatementTasks.tasks;

import java.util.Scanner;

import static java.util.Scanner.*;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

      Scanner sc=new Scanner(System.in);
        double bir= 126.5;
        double iki= 224.6;
        if ( bir> iki){
            System.out.println("double 1 is greater than double 2 ");
        }else if( bir< iki){
            System.out.println("double 1 is smaller than double 2");
        }


    }
}
