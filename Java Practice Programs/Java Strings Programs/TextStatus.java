import java.util.Scanner;

public class TextStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text ; 
		
		System.out.println("Enter the text: ");
		text = sc.nextLine();
		if(text.isEmpty()) {
			System.out.println("No string inserted");
		}
		else {
			getTextStatus(text);
		}
		
		sc.close();
	}

	private static void getTextStatus(String text) {
		int characterCount = 0;
		int wordCount = 1;
		String currentString = text;
		int size = text.length();
 		for(int i = 0; i < size; i++) {
			if(currentString.charAt(i) != ' ') {
				characterCount++;
			}
			else {
				wordCount++;
			}
		}
		
		System.out.println("Character count is: "+characterCount);
		System.out.println("Word count is: "+wordCount);
		
		
	}

}
