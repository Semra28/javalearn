package j15_Arrays.ArraysEasyTasks.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
/*
        int arr[] = {5, 6, 8, 12, 14, 19};
        int arrSonuc = 0;
        for (int i = 0; i < arr.length; i++) {//bu lopp array elemalarını toplar
            if (arr[i] % 2 == 0) {
                arrSonuc += arr[i];
            }
            if (arr[i] % 2 == 1) {
                arrSonuc -= arr[i];
            }
            System.out.println(arrSonuc);
 */
        int number[]={5,6,8,12,14,19};
        int tpl=0;
        for (int i = 0; i < number.length ; i++) {
            tpl=number[i]%2==0?tpl+number[i]:tpl-number[i];
        }
        System.out.println("tpl = " + tpl);
        }

    }

