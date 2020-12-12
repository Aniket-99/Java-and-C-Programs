package com.java.practice;

class SpeedInvalidException extends Exception {
	public SpeedInvalidException(String msg) {
		super(msg);
	}
}

class CarSpeed {
	String speed;
}

class CarSpeedImplementation {

	public String setCarSpeed(CarSpeed sp, int spd) {
		sp = new CarSpeed();
		try {
			if (spd < 30 || spd > 90) {
				throw new SpeedInvalidException("Exception in Speed Validation");
			} else {
				sp.speed = "Valid";
			}
		} catch (SpeedInvalidException s) {
			System.out.println(s.getMessage());
			sp.speed = "Invalid";
		} catch (Exception e) {

		}
		return sp.speed;

	}
}

public class CarSpeedMain {

	public static void main(String[] args) {
		CarSpeed carSpeed = new CarSpeed();
		CarSpeedImplementation carSpeedImplementation = new CarSpeedImplementation();
		String message = carSpeedImplementation.setCarSpeed(carSpeed, 20);
		System.out.println(message);

	}

}
