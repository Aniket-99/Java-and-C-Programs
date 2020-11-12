import java.util.Scanner;

public class StringSortingAndManipulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total;
		System.out.println("Enter the total number of strings in the array: ");
		total = sc.nextInt();
		
		String[] stringArray = new String[total];
		System.out.println("Enter the string: ");
		for(int i = 0; i < total; i++) {
			stringArray[i] = sc.next();
		}
		
		
		String[] resultArray = getSortedManipulationStringArray(stringArray, total);
		System.out.println("The manipulated array is: ");
		for(String value : resultArray) {
			System.out.println(value);
		}
		sc.close();
	}

	private static String[] getSortedManipulationStringArray(String[] stringArray, int total) {
		String[] currentArray = stringArray;
		
		int mid = 0;
		if(total % 2 == 0) {
			mid = total/2;
		}
		else {
			mid = (total/2) + 1;
		}
		
		for(int i = 0; i < total-1; i++) {
			for(int j = i + 1; j < total; j++) {
				if(currentArray[i].compareTo(currentArray[j])>0) {
					String tempVariable = currentArray[i];
					currentArray[i] = currentArray[j];
					currentArray[j] = tempVariable;
				}
			}
		}
		
		for(int k = 0; k < mid; k++) {
			currentArray[k] = currentArray[k].toUpperCase();
			for(int m = mid; m < total; m++) {
				currentArray[m] = currentArray[m].toLowerCase();
			}
		}
		
		return currentArray;
	}

}
