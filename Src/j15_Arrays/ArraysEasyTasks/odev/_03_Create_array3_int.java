package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Create_array3_int {

    private static int arrToplam;

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int arr[] = {25, 30, 30, 35, 100};
              int toplam=0;
        for (int i = 0; i < arr.length; i++) {//bu lopp array elemalarını toplar

         arrToplam += arr[i];
}
        System.out.println(arrToplam);
    }}
