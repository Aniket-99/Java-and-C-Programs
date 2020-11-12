import java.util.Scanner;

public class ReverseAndSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of integers in the array: ");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int[] resultArray = getSorted(array);
		System.out.println("The reverse and sorted array is: ");
		for (int j = 0; j < size; j++) {
			System.out.println(resultArray[j]);
		}
		sc.close();
	}

	private static int[] getSorted(int[] array) {

		int[] newArray = array;
		int size = newArray.length;
		int[] reverseNumberArrray = new int[size];
		for (int i = 0; i < size; i++) {
			reverseNumberArrray[i] = getReverseOfNumber(newArray[i]);
		}
		
		for(int j = 0; j < size; j++) {
			for(int k = j + 1; k < size; k++) {
				if(reverseNumberArrray[j] > reverseNumberArrray[k]) {
					int temp = reverseNumberArrray[j];
					reverseNumberArrray[j] = reverseNumberArrray[k];
					reverseNumberArrray[k] = temp;
				}
			}
		}

		return reverseNumberArrray;
	}

	private static int getReverseOfNumber(int i) {
		int number = i;
		int reverse = 0;
		int value;
		while (number > 0) {
			value = number % 10;
			reverse = reverse * 10 + value;
			number /= 10;
		}

		return reverse;
	}

}
