package com.stream.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductImplementation {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Sugar", 500, "Food", 100));
		productList.add(new Product(2, "Soap", 300, "Luxury", 200));
		productList.add(new Product(3, "Shirt", 800, "Essential", 2));
		productList.add(new Product(4, "Shirt", 800, "Essential", 100));
		productList.add(new Product(5, "Tv", 20000, "Luxury", 100));
		productList.add(new Product(6, "House", 587400, "Essential", 300));
		productList.add(new Product(7, "Pen", 20, "Essential", 200));
		// productHighestPrice(productList);
		// countOfCategory(productList, "Shirt");
		// System.out.println("The products whose reorderlevel is equal to 100 is: ");
		// ArrayList<String> result = reorderLevel(productList);
		// result.forEach(System.out::println);

		// System.out.println("The product whose price is less tha 500 is: ");
		// ArrayList<Product> res = priceLessThan100(productList);
		// res.stream().map(p->p.getName()+":"+p.getPrice()).forEach(System.out::println);

		// System.out.println("The product whose price is greater than 1000 is: ");
		// Map<String, Double> result = priceGreaterThan1000(productList);
		// for(Map.Entry<String, Double> entry: result.entrySet()) {
		// System.out.println(entry.getKey()+": "+entry.getValue());
		// }
		//
		// System.out.println("The concatenated product names is: ");
		// String result = getAllProductNames(productList);
		// System.out.println(result);

		System.out.println("The product names is: ");
		ArrayList<String> names = productNames(productList);
		names.forEach(System.out::println);

	}

	public static void productHighestPrice(List<Product> productList) {
		Optional<Product> highest = productList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)));
		Product p = highest.get();
		System.out.println("The highest price product is: " + p.getName());
	}

	public static void countOfCategory(List<Product> productList, String productName) {
		Map<String, Long> count = productList.stream().filter(p -> p.getName().equals(productName))
				.collect(Collectors.groupingBy(Product::getName, Collectors.counting()));
		System.out.println("The count of the given product is: ");
		for (Map.Entry<String, Long> m : count.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}

	public static ArrayList<String> reorderLevel(List<Product> productList) {
		ArrayList<String> isGreater = (ArrayList<String>) productList.stream().filter(p -> p.getReorderlevel() == 100)
				.map(p -> p.getName()).collect(Collectors.toList());
		return isGreater;
	}

	public static ArrayList<Product> priceLessThan100(List<Product> productList) {
		ArrayList<Product> isLess = (ArrayList<Product>) productList.stream().filter(p -> p.getPrice() < 500)
				.collect(Collectors.toList());
		return isLess;
	}

	public static Map<String, Double> priceGreaterThan1000(List<Product> productList) {
		Map<String, Double> isGreater = productList.stream().filter(p -> p.getPrice() > 1000)
				.collect(Collectors.toMap(Product::getName, Product::getPrice));
		return isGreater;

	}

	public static String getAllProductNames(List<Product> productList) {

		ArrayList<String> allProductNames = (ArrayList<String>) productList.stream().map(p -> p.getName())
				.collect(Collectors.toList());

		StringBuffer stringBuffer = new StringBuffer();
		// for(int i = 0; i < allProductNames.size(); i++) {
		// stringBuffer.append(allProductNames.get(i));
		// stringBuffer.append(" : ");
		//
		// }

		Iterator<String> iterator = allProductNames.iterator();
		while (iterator.hasNext()) {
			stringBuffer.append((String) iterator.next());
			if (!(iterator.hasNext())) {
				break;
			}
			stringBuffer.append(": ");
		}
		return stringBuffer.toString();

	}

	public static ArrayList<String> productNames(List<Product> productList) {
		ArrayList<String> names = (ArrayList<String>) productList.stream().map(e -> e.getName())
				.collect(Collectors.toList());
		return names;
	}

}
