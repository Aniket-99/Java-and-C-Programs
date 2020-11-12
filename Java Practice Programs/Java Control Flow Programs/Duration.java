import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now(); // Current date
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		//String formattedDate = localDate.format(dateTimeFormatter);

		Scanner sc = new Scanner(System.in);
		int date, month, year;

		try {
			System.out.println("Enter the date: ");
			date = sc.nextInt();

			System.out.println("Enter the month: ");
			month = sc.nextInt();

			System.out.println("Enter the year: ");
			year = sc.nextInt();

			LocalDate userInputDate = LocalDate.of(year, month, date);
			String userFormattedDate = userInputDate.format(dateTimeFormatter);
			System.out.println(userFormattedDate);

			int yearDifference = Math.abs(userInputDate.getYear() - localDate.getYear());
			int dayDifference = Math.abs(userInputDate.getDayOfMonth() - localDate.getDayOfMonth());
			int monthDifference = Math.abs(userInputDate.getMonthValue() - localDate.getMonthValue());
			
			System.out.println("The day difference is: " + dayDifference);
			System.out.println("The month difference is: " + monthDifference);
			System.out.println("The year difference is: " + yearDifference);
		} catch (Exception e) {
			System.out.println("Please enter correct format");
		}

		

		sc.close();

	}

}
