package com.java.practice;

public class MultipleExceptions {
	public String string1;
	public String string2;
	public String operator;

	public MultipleExceptions(String string, String string2, String operator) {
		this.string1 = string;
		this.string2 = string2;
		this.operator = operator;
	}

	public static String handleException(MultipleExceptions a) {

		try {
			if (a.string1.equals(null) || a.string2.equals(null)) {
				throw new NullPointerException();
			}
			else if(a.operator != "+" && a.operator != "-") {
				throw new RuntimeException();
			}
		} catch (NullPointerException e) {
			return "Null Values Found";
		}
		catch(RuntimeException e) {
			return a.operator.toString();
		}
		return "no exception found";
	}

	public static String doOperation(MultipleExceptions a) {
		String res = "";
		
		if (a.operator.equals("+")) {
			res = a.string1.concat(a.string2);
			
		} 
		else if(a.operator.equals("-")){
			res = a.string1.replace(a.string2, " ");
		}
		return res;
	}

	public static void main(String[] args) {
		MultipleExceptions m1 = new MultipleExceptions("hello", "world", "+");
		MultipleExceptions m2 = new MultipleExceptions("hello", "world", "-");
		String msg = handleException(m1);
		System.out.println(msg);
		String ms2 = doOperation(m1);
		System.out.println(ms2);

	}

}