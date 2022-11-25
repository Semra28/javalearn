package Tasks2;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner input= new Scanner(System.in);
		System.out.print("bir tam sayı giriniz: ");
		int sayı8= input.nextInt();
		System.out.print("ikinci bir tam sayı giriniz");
		int sayı9= input.nextInt();
		System.out.println("toplama sonucu:"+(sayı8+sayı9)+"\n Çıkarma Sonucu :"+(sayı8-sayı9)+"\nÇarpma sonucu: "+(sayı8*sayı9)+"\n Bölme Sonucu: "+(sayı8/sayı9));












	}

}
