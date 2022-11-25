package j16_ArrayList.ArrayListTasks.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {

        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
      static  double toplam=0;
      static ArrayList<Integer> sayi =new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int str =1;
        int start;
        while (str==1) {
            System.out.println("Lütfen bir sayı giriniz: ");
            start = scan.nextInt();
            sayi.add(start);
            toplam += start;
            System.out.println("başka sayı girmek istermisin? : evet (1), hayır için(2) seçip  ok le");
            str = scan.nextInt();
        }
        ortalamaUstu();



    }//main sonu

    private static void ortalamaUstu() {
        double ort = toplam / sayi.size();
        System.out.println("Tatlım girdigin sayıların ortalaması :" + ort);
        System.out.println("Tatlım girdiğin sayılardan Ortalamyı geçen sayılar :");
        for (int i = 0; i < sayi.size(); i++) {
            if (sayi.get(i) > ort) {
                System.out.println(sayi.get(i) + "");
            }
        }
        System.out.println();
    }
    }//finish






