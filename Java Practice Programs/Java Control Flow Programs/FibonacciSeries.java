import java.util.Scanner;
public class FibonacciSeries {
	static int fiboNumberOne = 0, fiboNumbertwo = 1, fiboNumberThree = 0; // Initializing static variables in order to
																			// have only one instance

	public static void main(String[] args) {
		int range = 0;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the range upto which you want to generate fibonaci series: ");
			range = sc.nextInt();
			if (range <= 0) {
				System.out.println("Please enter value greater than 0");
			} else {
				//int result = printFibonacciSeries(range); // Printing Fibonacci series without recursion
				int result = printFibonacciSeriesUsingRecursion(range-2); // Printing
				// Fibonacci series with recursion
				System.out.println(result);
			}

		} catch (Exception e) {
			System.out.println(
					"Please input range in numbers only! Please avoid character,string, double or float values");
		}

		sc.close();

	}

	// Method to find fibonacci series using recursion
	private static int printFibonacciSeriesUsingRecursion(int range) {
		int discriminate = range;
		int result = 0;
		if (discriminate > 0) {
			fiboNumberThree = fiboNumberOne + fiboNumbertwo;
			fiboNumberOne = fiboNumbertwo;
			fiboNumbertwo = fiboNumberThree;
			// System.out.println(fiboNumberThree);
			printFibonacciSeriesUsingRecursion(discriminate - 1);
			result = fiboNumberThree;
		}
		return result;

	}

	// Method to find fibonacci series without recursion
	private static int printFibonacciSeries(int range) {
		int fiboNumberOne = 0, fiboNumbertwo = 1, fiboNumberThree = 0;
		int startValue = 2;

		while (startValue < range) {
			fiboNumberThree = fiboNumberOne + fiboNumbertwo;
			// System.out.println(fiboNumberThree);
			fiboNumberOne = fiboNumbertwo;
			fiboNumbertwo = fiboNumberThree;
			startValue++;
		}
		return fiboNumberThree;

	}

}
