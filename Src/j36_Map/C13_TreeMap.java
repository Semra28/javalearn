package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {

 /*
        TreeMap->
        1-TreeMap key'lrde null değer tanımlanamaz.Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(103, "Defne");
        tm.put(101, "Melis");
        tm.put(105, "Semra");
        tm.put(102, "Zümra");
        tm.put(104, "Erva");

        System.out.println("tm=" + tm);//[101=Melis,102=Zümra,103=Defne,104=Erva,105=Semra]
        //tm.put(null,"İsmet");//NullPointerException
        tm.put(104, "Meryem");//104 key degeri Meryem value degeri ile update edildi}
        tm.put(106, null);
        tm.put(107, null);

        System.out.println("tm=" + tm);//{101 =Melis,102 =Zümra ,103=Defne ,104=Meryem,105=Semra,106=null,107=null}
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm=" + hm);
        TreeMap<String, String> tm1 = new TreeMap<>(hm);//hm treeMap e atanarak convert edildi.
        //TreeMap<String,String>tm2=hm;//CTE->dataType miss-Match
        System.out.println("tm1=" + tm1);//{Amazon=296 Euro, Apple store=333 Euro,Ebay=234 euro,MediaMarkt=183 Euro,Saturn=300 Euro,Vatan=111}
        System.out.println("tm.ceilingKey(103)=" + tm.ceilingKey(103));//tm.ceilingKey(103);->method parametre olarak girilen key deger map'de varsa return eder.}
        // yoksa parametreden buyuk en kuçuk key değerini return eder.
        //parametre map'de yok ve parametreden buyuk en kucuk  key de yoksa null return eder
        //ceilingKey(key)-> en kucuk abi-abla
        System.out.println("tm.ceilingKey(108)="+tm.ceilingKey(108));//null
        System.out.println("tm.ceilingKey(1)="+ tm.ceilingKey(1));//101->1'den buyuk en küçük key 101
        System.out.println("tm.ceilingKey(110)"+tm.ceilingKey(110));//null->110 dan buyuk en kuçuk Key yok

        //ascending order->Artan sıralama
        //descending order->azalan sıralama

        System.out.println("tm.descendingKeySet()="+ tm.descendingKeySet());//[107,106,105,104,103,102,101]
        System.out.println("tm.keySet()="+ tm.keySet());//[101,102,103,104,105,106,107]
        System.out.println("tm.firstKey()="+ tm.firstKey());//101
        System.out.println("tm.lastKey()="+ tm.lastKey());//107





    }}