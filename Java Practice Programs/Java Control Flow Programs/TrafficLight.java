import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice: "); // Asking user to enter choice
		System.out.println("1.Red\n2.Yellow\n3.Green");
		try {
			choice = sc.nextInt(); // Taking input and storing in choice variable

			// Checking the equality using switch-case
			switch (choice) {
			case 1:
				System.out.println("Stop!");
				break;
			case 2:
				System.out.println("Ready!");
				break;
			case 3:
				System.out.println("Go!");
				break;
			default:
				System.out.println("Please enter correct choice!!");

			}
		} catch (Exception e) {
			System.out.println("Please enter the correct choice!!");
		} finally {
			sc.close();
		}

	}

}
