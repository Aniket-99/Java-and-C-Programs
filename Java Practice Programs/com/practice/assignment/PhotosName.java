package com.practice.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

public class PhotosName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the photo file name: ");
			String fileName = sc.nextLine();
			String result = filterName(fileName);
			System.out.println(result);
		} catch (InputMismatchException e) {
			System.out.println("Invalid format");
		} catch (NumberFormatException e) {
			System.out.println("Invalid format");
		} finally {
			sc.close();
		}

	}

	public static String filterName(String fileName) {
		int size = fileName.length();
		int convertMonthToInt = 0;
		int convertFileNumberToInt = 0;
		if (size < 7) {
			return "Invalid input";
		}

		String code = fileName.substring(0, 3);
		String month = fileName.substring(3, 5);
		String number = fileName.substring(5, size);

		StringBuffer formattedFileName = new StringBuffer();

		convertMonthToInt = Integer.parseInt(month);
		convertFileNumberToInt = Integer.parseInt(number);

		boolean checkStatus = check(code, convertMonthToInt, number);

		if (checkStatus) {
			switch (convertMonthToInt) {
			case 1:
				formattedFileName.append("JAN_" + convertFileNumberToInt);
				break;
			case 2:
				formattedFileName.append("FEB_" + convertFileNumberToInt);
				break;
			case 3:
				formattedFileName.append("MAR_" + convertFileNumberToInt);
				break;
			case 4:
				formattedFileName.append("APR_" + convertFileNumberToInt);
				break;
			case 5:
				formattedFileName.append("MAY_" + convertFileNumberToInt);
				break;
			case 6:
				formattedFileName.append("JUN_" + convertFileNumberToInt);
				break;
			case 7:
				formattedFileName.append("JUL_" + convertFileNumberToInt);
				break;
			case 8:
				formattedFileName.append("AUG_" + convertFileNumberToInt);
				break;
			case 9:
				formattedFileName.append("SEP_" + convertFileNumberToInt);
				break;
			case 10:
				formattedFileName.append("OCT_" + convertFileNumberToInt);
				break;
			case 11:
				formattedFileName.append("NOV_" + convertFileNumberToInt);
				break;
			case 12:
				formattedFileName.append("DEC_" + convertFileNumberToInt);
				break;
			default:
				System.out.println("Invalid month");
				break;
			}
		}
		return formattedFileName.toString();

	}

	public static boolean check(String code, int convertMonthToInt, String number) {
		boolean flag = true;
		
		boolean fileNameCheck = Pattern.matches("[0]+", number);
		
		if (!(code.equals("DSC"))) {
			System.out.println("Invalid input");
			flag = false;
		} 
		else if (!(convertMonthToInt >= 1 && convertMonthToInt <= 12)) {
			System.out.println("Invalid month");
			flag = false;
		}
		else if(fileNameCheck) {
			System.out.println("Invalid file name");
			flag = false;
		}
		return flag;

	}

}
