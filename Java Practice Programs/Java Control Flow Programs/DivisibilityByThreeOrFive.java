import java.util.Scanner;

public class DivisibilityByThreeOrFive {

	public static void main(String[] args) {
		CalculateDivisibilitySum calculateDivisibilitySumObj1 = new CalculateDivisibilitySum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int result = calculateDivisibilitySumObj1.calculateSum(number);
		System.out.println("The sum is: " + result);
		sc.close();
	}

}

class CalculateDivisibilitySum {
	public int calculateSum(int n) {
		int sumOfDivisibility = 0;
		int numbers = n;

		for (int i = 1; i <= numbers; i++) {
			if (i % 3 == 0 | i % 5 == 0) {
				sumOfDivisibility += i;
			}
		}
		return sumOfDivisibility;
	}
}
