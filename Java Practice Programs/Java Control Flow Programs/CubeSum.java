import java.util.Scanner;

public class CubeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt(); // Taking input from user and storing in num variable
		int result = 0; // initializing result to 0
		for (int i = 1; i <= num; i++) {
			result += Math.pow(i, 3); // Calculating cube of number and adding it in result

		}
		System.out.println("The sum of the cubes is: " + result);
		sc.close();
	}
}
