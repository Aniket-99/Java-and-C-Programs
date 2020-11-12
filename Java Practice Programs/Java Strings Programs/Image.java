import java.util.Scanner;

public class Image {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String currentString;
		System.out.println("Enter the string to get the mirror image: ");
		currentString = sc.nextLine();
		System.out.println("The mirror image of string is: "+getImage(currentString));
		sc.close();

	}
	private static String getImage(String currentString) {
		
		StringBuffer stringBuffer = new StringBuffer(currentString);
		stringBuffer.reverse();
		stringBuffer.insert(0, currentString+"|");
		//System.out.println(stringBuffer);
		return stringBuffer.toString();
	}

}
