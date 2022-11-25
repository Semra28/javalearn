package Tasks3;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner input =new Scanner(System.in);
		System.out.println(" Lütfen üç basamaklı bir sayı giriniz: ");
		int i= input.nextInt();
		int ilk=i/10;
		int son=i%10;
		System.out.println(ilk+son);
		input.close();




		
	}

}
