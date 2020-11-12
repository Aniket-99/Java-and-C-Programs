import java.util.Scanner;

public class StringAlteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String currentString;
		System.out.println("Enter the String for which you want to replace: ");
		currentString = sc.nextLine();
		
		String result = alterString(currentString);
		System.out.println("The altered string is: "+result);
		sc.close();
	}
	private static String alterString(String currentString) {
		
		String str = currentString;
		int size = str.length();
		StringBuffer stringBuffer = new StringBuffer();
		
		
		
		for(int i = 0; i < size; i++) {
			Character ch = str.charAt(i);
			if((ch == 'a' | ch == 'e' |ch == 'i' |ch == 'o' |ch == 'u' |
					ch == 'A' |ch == 'E' |ch == 'I' | ch == 'O' | ch == 'U')) {
				stringBuffer.append(ch);
			}
			else {
				char getValue = (char) (ch + 1);
				stringBuffer.append(getValue);
			}
			
		}
		return stringBuffer.toString();
		
		
		
		
	}
	
}
