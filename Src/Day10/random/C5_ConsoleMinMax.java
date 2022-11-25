package Day10.random;

public class C5_ConsoleMinMax {
    public static void main(String[] args) {
        //1.yol
        int min = 50;
        int max = 120;

        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomNum = " + randomNum);

        System.out.println(randomNum % 2 == 0 ? "cift" : "tek");

        //2.yol
        int randomSayi = (int) (Math.random()*80);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println(randomSayi %2 == 0 ? "cift" : "tek");




    }
}
