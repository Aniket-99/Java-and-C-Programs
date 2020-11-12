import java.util.Scanner;

public class StringPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text;
		System.out.println("Enter the text: ");
		text = sc.nextLine();
		boolean result = findStringStatus(text);

		if(result) {
			System.out.println("String is Positive");
		}
		else {
			System.out.println("String is Negative");
		}
	
		sc.close();
	}
	
	private static boolean findStringStatus(String str) {
		String currentString = str;
		char[] charArray = currentString.toCharArray();
		System.out.println(charArray[0]);
		int size = charArray.length;
		int charVal, nextCharVal;
		boolean flag = true;
		for(int i = 0; i < size; i++) {
			charVal = charArray[i];
			for(int j = i+1; j < size; j++) {
				nextCharVal = charArray[j];
				if(charVal < nextCharVal) {
					continue;
				}
				else {
					flag = false;
				}
			}	
		}
		return flag;
		
	}

}
