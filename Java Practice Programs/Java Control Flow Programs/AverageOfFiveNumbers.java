import java.util.Scanner;

public class AverageOfFiveNumbers {
	
	public static void main(String[] args) {
		//Find average of 5 numbers using Arrays.
		Scanner sc = new Scanner(System.in);
		int [] myArray = new int[5];
		int average = 0;
		int sum = 0;
		
		System.out.println("Enter the five numbers: ");
		
		for(int i = 0; i < 5; i++) {
			myArray[i] = sc.nextInt();
		}
		
		for(int j = 0; j < 5; j++) {
			sum+=myArray[j];
		}
		
		average = sum/5;
		
		System.out.println("The average of five numbers is: "+average);
		
		sc.close();
	
		

	}

}
