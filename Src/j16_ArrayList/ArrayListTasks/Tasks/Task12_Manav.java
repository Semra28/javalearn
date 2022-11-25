package j16_ArrayList.ArrayListTasks.Tasks;


import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

     Scanner scan =new Scanner (System.in);
     String urun[]={"1-Avokado","2-Brokoli","3-Mandalina","4-Karpuz","5-Mango"};
     double fyt[]={15,20,14,10,16};
     boolean devamMi=true;
     int secim;
     double kilo;
     double toplamtutar=0;
     while(devamMi){
         System.out.println(Arrays.toString(urun));
         System.out.println("Almak istediğin urun nosunu yazınız:");

          secim= scan.nextInt();
         System.out.println("lütfen almak istediğiniz miktarı kg cinsinden yazınız:");
         kilo= scan.nextDouble();
          toplamtutar+=kilo*fyt[secim+1];
         System.out.println("Başka bir urun almak istermisin? evetse '1',Hayırsa '2'");
         secim= scan.nextInt();
         if (secim==2) devamMi=false;


    }
        System.out.println("Ödeyeceğiniz toplam tutar="+toplamtutar+"turklirasıdir");
    }




}

