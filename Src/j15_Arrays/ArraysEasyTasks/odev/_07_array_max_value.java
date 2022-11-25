package j15_Arrays.ArraysEasyTasks.odev;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int maxeleman = 0;
        int array[] = {12, 2, 5, 15, 8};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxeleman) {
                maxeleman = array[i];
            } else {
                maxeleman = maxeleman;
            }
        }
        System.out.println("maxeleman = " + maxeleman);
    }
}


