package j12_Lopps.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner sc=new Scanner(System.in);
		String kelime=sc.next();
		for(int i=0;  i <kelime.length(); i++){
			System.out.println(kelime.length());
		}

	}
}
