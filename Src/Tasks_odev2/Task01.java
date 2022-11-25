package Tasks2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mid-term grade, final grade, and project grade");
        System.out.print("Your mid-term grade is : ");
        int midtermGrade = input.nextInt();
        System.out.print("Your final grade is : ");
        int finalGrade = input.nextInt();
        System.out.print("Your project grade is : ");
        int projectGrade = input.nextInt();
        System.out.println("averagegrade:"+((midtermGrade*0.30)+(finalGrade*0.50)+(projectGrade*0.20)));






    }
}
