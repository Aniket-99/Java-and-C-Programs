import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		boolean result = checkNumber(number);
		if (result) {
			System.out.println("The number is power of 2");
		} else {
			System.out.println("The number is not a power of 2");
		}

		sc.close();

	}

	static boolean checkNumber(int n) {
		int number = n;
		if (number == 0) {
			return false;
		} else {
			while (number != 1) {
				if (number % 2 == 0) {
					number /= 2;
				} else {
					return false;
				}
			}
			return true;
		}

	}

}
