package Day08;

import java.util.Scanner;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        Scanner scan = new Scanner(System.in);
        int a[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int min=Integer.MIN_VALUE;
        for(int i=0; i< a.length;i++){
            for(int j=0;j<a[i].length;j++){
             min=Math.min(min,a[i][j]);
            }
        }
        System.out.println("Minumum sayı= "+min);
        //$ ları ve € ları kaldırıp toplama
        String b [][]={{"$12","$22"}};
    }
}
