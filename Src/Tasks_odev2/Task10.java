package Tasks2;

     import java.util.Scanner;

public class Task10 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

    // c = (f-32)*5/9

     // c = (f-32)*5/9

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Fahrenheit degeri giriniz:");
          double f = scan.nextDouble();
          System.out.println("Celcius degeri:" + (f - 32) * 5 / 9);


     }

}
