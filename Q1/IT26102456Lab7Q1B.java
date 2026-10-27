import java.util.Scanner;
public class IT26102456Lab7Q1B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		for(int s = 1; s <= 3; s++){
			System.out.println("\nStudent" + s);
			System.out.print("Enter marks :");
			
			int total = 0;
			for(int i = 0; i < 4; i++){
				total += input.nextInt();
			}
			
			double average = total / 4.0;
			
			System.out.println("Average is :" + average);
			System.out.print("Ovarall grade is: ");
			
			if(average >= 75 && average <= 100){
				System.out.println("Distinction");
			}else if(average >= 50 && average <= 74){
				System.out.println("Credit");
			}else {
				System.out.println("Fail");
			}
		}
		input.close();
	}
}