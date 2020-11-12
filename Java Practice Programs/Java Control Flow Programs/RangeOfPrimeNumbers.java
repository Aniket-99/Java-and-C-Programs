import java.util.Scanner;

public class RangeOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating an instance of scanner class

		int starting, ending; // Declaring variables

		System.out.println("Enter the lower range: "); // Displaying user to enter upper range
		starting = sc.nextInt(); // taking user input and storing in starting variable

		System.out.println("Enter the upper range: ");// Displaying user to enter lower range
		ending = sc.nextInt(); // taking user input and storing in ending variable

		printPrimeNumbers(starting, ending); // calling the printPrimeNumbers method

		sc.close(); // Closing the scanner instance
	}

	static void printPrimeNumbers(int starting, int ending) {

		if (ending == starting) {
			System.out.println("Both the values are equal!Please enter a valid range");
		}

		for (int i = starting; i <= ending; i++) {
			// if value is 0 or 1 skip the iteration
			if (i == 0 || i == 1) {
				continue;
			}

			int flag = 0; // setting the flag to 0 which means when flag is 0 the number is prime
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) { // checking whether the flag is set to 0, if set prime number else not prime
				System.out.println(i + " is a prime number");
			} else {
				System.out.println(i + " is not a prime number");
			}
		}
	}
}
