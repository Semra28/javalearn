package j16_ArrayList.ArrayListTasks.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(20,25,14,8,6));
        ArrayList<Integer> tamkareler = new ArrayList<>();
        int karelertoplamı = 0;
        for (int i=0; i<listSayi.size();i++) {
            tamkareler.add(listSayi.get(i)*listSayi.get(i));
            karelertoplamı += listSayi.get(i)*listSayi.get(i);


        }

        System.out.println("tamkareler = " + tamkareler);
        System.out.println("karelertoplamı = " + karelertoplamı);


    }
}

