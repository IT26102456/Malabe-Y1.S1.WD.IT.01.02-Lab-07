import java.util.Scanner;
public class  IT26102456Lab7Q1{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++){
			System.out.println("student" + i);
			
			System.out.print("Enter marks for four subjects:");
			
			double m1 = sc.nextDouble();
			double m2 = sc.nextDouble();
			double m3 = sc.nextDouble();
			double m4 = sc.nextDouble();
			
			double average = ( m1 + m2 + m3 + m4)/ 4.0;
			String grade;
			
			if(average >= 75 && average <= 100){
				grade = "Distintion";
			} else if(average >= 50){
				grade = "Credit";
			} else {
				grade = "Fail";
			}
			
			System.out.println("Average is :" + average);
			System.out.println("Overall Grade is :" + grade);
			System.out.println();
		}
		sc.close();
	}
}