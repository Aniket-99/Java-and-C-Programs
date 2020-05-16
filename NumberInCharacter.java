import java.util.*;

class NumberInCharacter{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to convert into character: ");

		int number = sc.nextInt();

		int rev = 0,rem;

		while(number > 0){
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}

		int n = rev;

		while (n > 0){
			int value = n % 10;
			n = n/10;

			switch(value){
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				case 0:
					System.out.println("Zero");
					break;
				default:
					System.out.println("Error");
					break;
			}
			
		}
		sc.close();

	}
}