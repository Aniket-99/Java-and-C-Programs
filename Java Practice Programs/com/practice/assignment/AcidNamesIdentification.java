package com.practice.assignment;

import java.util.Scanner;
import java.util.regex.*;

public class AcidNamesIdentification {
	static int carbonElement, hydrogenElement, oxygenElement;
	static char carbon, hydrogen, oxygen;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String acidFormula;
		System.out.println("Enter the formula of acid:(Input should be 6 character long) ");
		acidFormula = sc.nextLine();
		AcidNamesIdentification acidentification = new AcidNamesIdentification();
		acidentification.validateInputFormula(acidFormula);
		// boolean pattern = Pattern.matches("C{1}[1-9]H{1}[1-9]O{1}[1-9]",
		// acidFormula);

	}

	public void validateInputFormula(String acidformula) {

		if (acidformula.length() != 6) {
			System.out.println("Invalid Input");
			return;
		} else {
			String carbon = acidformula.substring(0, 2);
			String hydrogen = acidformula.substring(2, 4);
			String oxygen = acidformula.substring(4, 6);

			if (!(checkCarbon(carbon))) {
				System.out.println("Invalid carbon");
				return;
			} else if (!(checkHydrogen(hydrogen))) {
				System.out.println("Invalid hydrogen");
				return;
			} else if (!(checkOxygen(oxygen))) {
				System.out.println("Invalid oxygen");
				return;
			} else {
				boolean status = checkAcid();
				if (status) {
					findAcid();
				} else {
					System.out.println("Invalid input");
				}
			}

		}

	}

	public boolean checkCarbon(String carbonData) {

		boolean flag = false;
		try {

			String carbonString = String.valueOf(carbonData);
			carbon = carbonString.charAt(0);

			carbonElement = Integer.parseInt(String.valueOf(carbonString.charAt(1)));

			if (carbon == 'C') {
				flag = true;
			} else {
				flag = false;
			}

			return flag;
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}

		return flag;

	}

	public boolean checkHydrogen(String hydrogenData) {

		boolean flag = false;
		try {
			String hydrogenString = String.valueOf(hydrogenData);
			hydrogen = hydrogenString.charAt(0);

			hydrogenElement = Integer.parseInt(String.valueOf(hydrogenString.charAt(1)));

			if (hydrogen == 'H') {
				flag = true;
			} else {
				flag = false;
			}

			return flag;
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}

		return flag;
	}

	public boolean checkOxygen(String oxygenData) {

		boolean flag = false;
		try {
			String oxygenString = String.valueOf(oxygenData);
			oxygen = oxygenString.charAt(0);

			oxygenElement = Integer.parseInt(String.valueOf(oxygenString.charAt(1)));

			if (oxygen == 'O') {
				flag = true;
			} else {
				flag = false;
			}

			return flag;
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}

		return flag;
	}

	public static boolean checkAcid() {

		boolean flag = false;
		if (carbonElement == 2 || carbonElement == 3 || carbonElement == 6 || carbonElement == 7
				|| carbonElement == 9) {
			flag = true;
			return flag;
		} else {
			System.out.println("Invalid Carbon Element");
			flag = false;
		}
		if ((hydrogenElement >= 4 && hydrogenElement <= 8) && (hydrogenElement % 2 == 0)) {
			flag = true;
			return flag;
		} else {
			System.out.println("Invalid Hydrogen Element");
			flag = false;
		}
		if (oxygenElement == 2 || oxygenElement == 3 || oxygenElement == 4 || oxygenElement == 6
				|| oxygenElement == 7) {
			flag = true;
			return flag;
		} else {
			System.out.println("Invalid Oxygen Element");
			flag = false;
		}
		return flag;
	}

	public void findAcid() {

		if (carbonElement == 2 && hydrogenElement == 4 && oxygenElement == 2) {
			System.out.println("Acetic Acid");

		} else if (carbonElement == 3 && hydrogenElement == 4 && oxygenElement == 4) {
			System.out.println("Pyruvic Acid");

		} else if (carbonElement == 3 && hydrogenElement == 6 && oxygenElement == 3) {
			System.out.println("Lactic Acid");

		} else if (carbonElement == 6 && hydrogenElement == 8 && oxygenElement == 6) {
			System.out.println("Ascorbic Acid");

		} else if (carbonElement == 6 && hydrogenElement == 8 && oxygenElement == 7) {
			System.out.println("Citric Acid");

		} else if (carbonElement == 7 && hydrogenElement == 6 && oxygenElement == 2) {
			System.out.println("Benzoic Acid");

		} else if (carbonElement == 9 && hydrogenElement == 8 && oxygenElement == 4) {
			System.out.println("Asprin");

		} else {
			System.out.println("Acid not found");
		}

	}

}
