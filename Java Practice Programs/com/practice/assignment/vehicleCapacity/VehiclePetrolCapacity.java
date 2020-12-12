package com.practice.assignment.vehicleCapacity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehiclePetrolCapacity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int petrolInVehicle, petrolToBeFilled;

		try {
			System.out.println("Enter the petrol in the vehicles in litres: ");
			petrolInVehicle = sc.nextInt();

			System.out.println("Enter the petrol to be filled in litres: ");
			petrolToBeFilled = sc.nextInt();
			
			int total = petrolInVehicle + petrolToBeFilled;
			
			boolean result = validatePetrol(total);
			
			if (result) {
				System.out.println("Petrol Tank will be sufficient");
			} else {
				throw new PetrolOverflowException("Petrol Tank Overflow");
			}
		} catch (PetrolOverflowException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid input");
		} finally {
			sc.close();
		}

	}

	public static boolean validatePetrol(int petrol) {
		int totalPetrolCapacity = 120;

		if (petrol > totalPetrolCapacity) {
			return false;
		} else {
			return true;
		}

	}

}
