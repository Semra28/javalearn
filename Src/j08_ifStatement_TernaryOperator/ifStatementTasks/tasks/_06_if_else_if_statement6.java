package j08_ifStatement_TernaryOperator.ifStatementTasks.tasks;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        System.out.println("bir number giriniz");
    if (number==0) {
        System.out.println("Im neutral");
    }else if (number>0){
        System.out.println("Im pozitive");
    }else if(number <0){
        System.out.println("I am negative ");
    }


    }
}
