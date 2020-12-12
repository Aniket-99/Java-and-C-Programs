package com.practice.assignment.speedAdaption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleSpeedAdaptation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentSpeed;
		
		try {
			System.out.println("Enter the vehicle speed in Km/hr");
			currentSpeed = sc.nextInt();
			boolean result = validateVehicleSpeed(currentSpeed);
			if(result) {
				System.out.println("Maintain the same speed");
			}else {
				throw new MaximumSpeedExceedException("Maximum Speed Exceeded");
			}
			
		}
		catch(MaximumSpeedExceedException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter valid input");
		}
		finally {
			sc.close();
		}
	}
	
	public static boolean validateVehicleSpeed(int speed){
		int maximumVehicleSpeed = 180;
		
		if(speed > maximumVehicleSpeed) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
}
