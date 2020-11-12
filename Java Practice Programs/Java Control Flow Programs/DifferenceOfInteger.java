import java.util.Scanner;

public class DifferenceOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number to calculate difference: ");
		number = sc.nextInt();
		int result = modifyNumber(number);
		System.out.println("The difference is: " + result);
		sc.close();
	}

	private static int modifyNumber(int number1) {
		StringBuffer stringBuffer = new StringBuffer();

		String convertNumberToString = String.valueOf(number1);
		convertNumberToString += "0";
		int size = convertNumberToString.length();
		int difference = 0;
		for (int i = 0; i < size - 1; i++) {
			difference = Math.abs(convertNumberToString.charAt(i) - convertNumberToString.charAt(i + 1));
			stringBuffer.append(difference);
		}

		String result = stringBuffer.toString();
		return Integer.parseInt(result);

	}
}
