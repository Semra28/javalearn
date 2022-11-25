package j35_HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //hashSet ve treeSet tanımlayıp run surelerini karşılaştırınız..
        //Trick run suresi için System.currentTimeMillis()meth. call ediniz...}

        long tsBasla = System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Saliha");
        ts.add("Semra");
        ts.add("Zümra");
        ts.add("Defne");
        ts.add("Erva");
        ts.add("Melis");
        ts.add("İsmet");

        long tsBitir = System.currentTimeMillis();//treeSet bitis zamanı alındı

        System.out.println("ts run suresi:" + (tsBitir - tsBasla));//treeSet run suresi hesaplandı

        System.out.println("   ***   ");

        long hsBasla = System.currentTimeMillis();
        HashSet<String> hs = new HashSet<>();
        hs.add("Güzelsin");
        hs.add("içli köfte");
        hs.add("Gökyüzü");
        hs.add("Okyanus");
        hs.add("Mutlu");
        hs.add("Tatlım");
        hs.add("Pide");
        hs.add("Lahmacun");
        hs.add("Köfte");

        long hsBitir= System.currentTimeMillis();
        System.out.println("hs run suresi:"+(hsBitir-hsBasla));
        //iyi bir javaCAN için gelişMAC lazım :)


    }
}