package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;

public class Haftn_TaskOdev2D {
    public static void main(String[] args) {
         /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */
        ArrayList<String>calışanlar= new ArrayList<>(Arrays.asList("Semra","Emine","Merve","Sinan"));
        ArrayList<String>işverenler= new ArrayList<>(Arrays.asList("şrkt1","şrkt2","şrkt3"));
        ArrayList<String>Sirketismi= new ArrayList<>(Arrays.asList("X","Y","Z"));

        ArrayList<ArrayList<String>>list=new ArrayList<>(Arrays.asList(calışanlar,işverenler,Sirketismi));
        System.out.println(list);


    }
}
