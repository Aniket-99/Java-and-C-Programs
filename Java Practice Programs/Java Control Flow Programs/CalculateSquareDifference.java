import java.util.Scanner;

public class CalculateSquareDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int result = calculateDifference(number);
		System.out.println("The result is: " + result);
		sc.close();
	}

	static int calculateDifference(int n) {
		int difference = 0, sumOfSquares = 0, sum = 0, squareOfSum = 0;
		int number = n;

		for (int i = 1; i <= number; i++) {
			sumOfSquares += (int) Math.pow(i, 2);
			sum += i;
		}

		squareOfSum = (int) Math.pow(sum, 2);
		difference = squareOfSum - sumOfSquares;

		return difference;
	}

}
