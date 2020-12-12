package com.labexercise.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		// 1st program using biconsumer
		BiConsumer<Integer, Integer> powerOf = (num1, num2) -> 
        { 
           int res = (int)Math.pow(num1, num2);
           System.out.println("The power of is: "+res);
        };   
        powerOf.accept(5,5);
        
        // 2nd program using Functional interface
        AddSpaceInterface addSpaceInterface = (str)->{
        	StringBuffer buffer = new StringBuffer();
        	for(int i = 0; i < str.length(); i++) {
        		buffer.append(str.charAt(i));
        		buffer.append(" ");
        	}
        	System.out.println("The space separated character is: "+buffer.toString());
        };
        addSpaceInterface.addSpace("Aniket");
        
        // 3rd program using BiPredicate interface
       BiPredicate<String, String> checkAuthentication = (userName, password) -> {
    	   String validUserName = "Aniket";
    	   String validPassword = "Karmakar";
    	   
    	   if(validUserName.equals(userName) && validPassword.equals(password)) {
    		   return true;
    	   }
    	   else {
    		   return false;
    	   }
       };
       
       boolean validate = checkAuthentication.test("Aniket","Karmakar");
       if(validate) {
    	   System.out.println("Authorized user");
       }
       else {
    	   System.out.println("Authentication declined");
       }
        
	}
	
	@FunctionalInterface
	public interface AddSpaceInterface {
		void addSpace(String str);
	}

}
