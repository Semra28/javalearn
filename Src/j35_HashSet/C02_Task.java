package j35_HashSet;

import java.util.*;
public class C02_Task {
    public static void main(String[] args) {
         /*
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i hashSet, linkedHashSet ve TreeSett'e atayınız.
         */
        String arr[] = {"Muharrem", "Umit", "Sinan", "Nihan"};
        arrayListeCevir(arr);
        HashSet<String> hs = new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts = new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hurra set:" + hs);
        System.out.println("erken gelen girer set:" + lhs);//[Muharrem, Sinan, Nihan, Umit]
        System.out.println("alfabetik sıra set:" + lhs);//[Muharrem, Umit, Sinan, Nihan]
        System.out.println("alfabetik sıra set:" + ts);//[Muharrem, Nihan, Sinan, Umit]
    }//main sonu

    public static ArrayList<String>arrayListeCevir(String[]arr){
        ArrayList<String>arLst=new ArrayList<>(List.of(arr));
        return arLst;

    }


}

