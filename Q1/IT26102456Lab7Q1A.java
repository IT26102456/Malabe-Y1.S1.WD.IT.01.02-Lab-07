import java.util.Scanner;
public class IT26102456Lab7Q1A{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		System.out.println("Enter marks for four subjects:");
		
		for(int i = 1; i <= 4; i++){
			System.out.print("Enter subject mark " + i + ": ");
			int mark = input.nextInt();
			total += mark;
		}
		
		double average = total / 4.0;
		
		System.out.println("\nAverage is :" + average);
		
		System.out.print("Overall Grade is :");
		if(average >= 75 && average <= 100){
			System.out.println("Distinction");
		}else if(average >= 50 && average <= 74){
			System.out.println("Credit");
		}else {
			System.out.println("Fail");
		}
		input.close();
		
		}
}