import java.util.*;

public class SecondSmallestNoInArray {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of integer: ");
		int size = sc.nextInt();
		int myArray[] = new int[size];
		
		System.out.println("Enter the number in the array: ");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		int result = getSecondSmallest(myArray);
		System.out.println("The second smallest element in the array is: " + result);
		getSecondSmallest(myArray);
		sc.close();
	}

	private static int getSecondSmallest(int[] myArray) {
		int[] newArray = myArray;
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i] > newArray[j]) {
					int temp = myArray[i];
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}
			}
		}
		return myArray[1];
	}
}
