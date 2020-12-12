package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Header {
	String from;
	String to;

	Header(String from, String to) {
		this.from = from;
		this.to = to;
	}
}

class EmailClass {
	Header header;
	String body;
	String greetings;

	EmailClass(Header header, String body, String greetings) {
		this.body = body;
		this.greetings = greetings;
		this.header = header;
	}
}

class EmailOperations {
	public int emailVerify(EmailClass e) {
		String from = e.header.from;
		String to = e.header.to;
		int count = 0;
		Pattern p = Pattern.compile("^[a-zA-z_]+@[a-zA-z]+.[a-zA-Z]");
		Matcher m1 = p.matcher(to);
		if (!m1.find()) {
			System.out.println("Invalid mail to");
			count = count + 1;
		}
		Matcher m2 = p.matcher(from);
		if (!m2.find()) {
			System.out.println("Invalid mail from");
			count = count + 1;
		}
		if (count == 2) {
			return 2;
		}
		if (count == 1) {
			return 1;
		}
		if (count == 0) {
			return 0;
		}
		return 3;
	}

	public String bodyEncryption(EmailClass e) {
		System.out.println(e.body);
		StringBuffer encryptedText = new StringBuffer();
		for(int i = 0; i < e.body.length(); i++) {
			if(e.body.charAt(i)==' ') {
				encryptedText.append(" ");
			}
			else {
				if(Character.isUpperCase(e.body.charAt(i))) {				
					char ch = (char)(e.body.charAt(i) + 3);
					encryptedText.append(ch);
				}
				else {
					char ch = (char)(e.body.charAt(i) - 3);
					encryptedText.append(ch);
				}
			}

		}
		System.out.println(encryptedText.toString());
		return null;
	}

	public String greetingMessage(EmailClass e) {
		String concat = "";
		// String fromm=e.header.from;
		int index = e.header.from.indexOf("@");
		concat = e.greetings + " " + e.header.from.substring(0, index);
		return concat;
	}
}

public class StringMan {
	public static void main(String[] args) {
		Header header = new Header("amit@gmail.com", "_amit@gmail");
		EmailClass email = new EmailClass(header, "Aniket is a good boy", "Regards");
		EmailOperations em = new EmailOperations();
		int count = em.emailVerify(email);
		System.out.println(count);
		String encrypt= em.bodyEncryption(email);
		System.out.println(encrypt);
		String greet= em.greetingMessage(email);
		System.out.println(greet);
		System.out.println("==================");
		
		
		Consumer<String> consumer= (String str)->System.out.println(str);
		consumer.accept("Hellooo from aniket");
		Supplier<String> supplier = ()->"Hello from supplier";
		consumer.accept(supplier.get());
		//----------------------------
		Predicate<Integer> predicate = num -> num%2==0;
		boolean res = predicate.test(9);
		System.out.println(res);
		//=----------------------
		BiFunction<Integer, Integer, Integer> biFunction = (a,b)->a>b?a:b;
		int result = biFunction.apply(9, 18);
		System.out.println(result);
		System.out.println("=-------");
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		System.out.println("Word legnth for locations:");
		locations.stream().map(String::length).forEach(System.out::print);
		
		
		
		

	}
}