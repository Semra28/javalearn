package j35_HashSet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class C01_LinkedList {   /*
        Task->
        Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bir linkedList create ediniz.
        Girilen bir String değeri linkedListte varlığını kontrol edip varsa slilp "Agam eleman halledildi"
        yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

         */
    public static void main(String[] args) {

        LinkedList < String > ll1 = new LinkedList<>(Arrays.asList("yakup", "javaCan", "javaTar", "Teykinay"));
    Scanner sc = new Scanner (System.in);
        System.out.println("Agam kime bakmıştınız: ");
        String aganınAdamı=sc.next();
        System.out.println(ll1);

        if (ll1.remove(aganınAdamı)) {//true ->sitenen node var ve silindi
            System.out.println("Agam eleman halledildi");
            System.out.println("aganın adamı hallolduktan sonra:" + ll1);
        } else System.out.println("Agam aradığınız kişiye ulaşılamadı");

    }
}