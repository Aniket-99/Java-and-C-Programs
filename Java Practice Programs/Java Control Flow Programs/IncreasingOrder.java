import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		// int number = sc.nextInt();
		// boolean result = checkNumber(number);
		// System.out.println(result);
		int number = sc.nextInt();
		boolean result = findIncreasingOrder(number);
		if (result) {
			System.out.println("The number is in increasing order");
		} else {
			System.out.println("The number is not in increasing order");
		}

		sc.close();

	}

	static boolean checkNumber(int number) {
		boolean flag = true;
		int currentNumber = number % 10;
		number = number / 10;

		while (number != 0) {
			if (currentNumber <= number % 10) {
				flag = false;
				break;
			}
			currentNumber = number % 10;
			number = number / 10;
		}
		return flag;
	}

	static boolean findIncreasingOrder(int number) {
		boolean flag = true;
		String newString = String.valueOf(number);
		int size = newString.length();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int value = Integer.valueOf(newString.charAt(i));
				int nextValue = Integer.valueOf(newString.charAt(j));

				if (value < nextValue) {
					continue;
				} else {
					flag = false;
				}
			}
		}
		return flag;

	}

}
