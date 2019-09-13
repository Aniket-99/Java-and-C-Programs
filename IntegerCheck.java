package practics;
import java.io.*;
import java.util.*;
public class IntegerCheck {

	public static void main(String[] args) {

		//initializing the variables for storing the count of positive,negative,zero,odd,even no's
		int pos=0,neg=0,none=0,even=0,odd=0;
		//creating Scanner object for taking values from the user
		Scanner sc = new Scanner(System.in);
		
		
		//taking 1st integer from user
		System.out.println("Please enter your first integer: ");
		int a = sc.nextInt();
		//taking 2nd integer from user
		System.out.println("Please enter your second integer: ");
		int b = sc.nextInt();
		//taking 3rd integer from user
		System.out.println("Please enter your third integer: ");
		int c = sc.nextInt();
		
		//displaying the inputs
		System.out.println("The three inputs integer are "+a+","+b+","+c);
		
		//checking the condition for postive numbers and storing the count
		if(a>0) {
			pos+=1;
		}
		if(b>0) {
			pos+=1;
		}
		if(c>0) {
			pos+=1;
		}
		//checking the condition for negative numbers and storing the count
		if(a<0) {
			neg+=1;
		}
		
		if(b<0) {
			neg+=1;
		}
		if(c<0) {
			neg+=1;
		}
		//checking the condition for zero numbers and storing the count
		if(a==0) {
			none+=1;
		}
		if(b==0) {
			none+=1;
		}
		if(c==0) {
			none+=1;
		}
		
		//checking the condition for even and odd numbers and storing the count 
		if(a%2==0) {
			even+=1;
					
		}
		else {
			odd+=1;
		}
		
		if(b%2==0) {
			even+=1;
					
		}
		else {
			odd+=1;
		}
		if(c%2==0) {
			even+=1;
					
		}
		else {
			odd+=1;
		}
		
		
		//displaying the values to the user
		System.out.println("The total number of positive numbers are "+pos);
		System.out.println("The total number of negative numbers are "+neg);
		System.out.println("The total number of 0's numbers are "+none);
		
		System.out.println("The total number of even numbers are "+even);
		System.out.println("The total number of odd numbers are "+odd);
		
		
		
		
		
		
		
		
	}

}
