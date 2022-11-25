package L02_WhileLoop.WhileLoopTasks.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
*/
        Scanner scan= new Scanner(System.in);
        int t=scan.nextInt();
        int countadet=1;
        int toplamSayi=0;
        int girSayi=scan.nextInt();
        System.out.println(" bir sayı giriniz");
        while(t-->0){
            countadet++;
            toplamSayi += girSayi;
            girSayi=scan.nextInt();
            System.out.println("toplam sayi="+toplamSayi+ "Sayi adedi="+ countadet);
        }






    }
}
