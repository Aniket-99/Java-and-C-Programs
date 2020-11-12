import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numbers;
		
		System.out.println("Enter space separated integers: ");
		numbers = sc.nextLine();
		
		findSum(numbers);
		
		sc.close();

	}
	
	private static void findSum(String numbers) {
		
		StringTokenizer stTokenizer = new StringTokenizer(numbers," ");
		int sum = 0;
		
		while(stTokenizer.hasMoreTokens()) {
			int currentNumber = Integer.parseInt(stTokenizer.nextToken());
			sum += currentNumber;
		}
		System.out.println("The sum is: "+sum);
		
	}

}
