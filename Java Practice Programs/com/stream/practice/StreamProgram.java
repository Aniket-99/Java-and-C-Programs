package com.stream.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Item {
	private Integer id;
	private String name;
	private Double cost;

	public Item(Integer id, String name, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

}

class ItemImplementation {
	public Double summationOfCost(List<Item> itemlist) {
		Double sum = itemlist.stream().map(i -> i.getCost()).reduce(0d, Double::sum);
		return sum;
	}

	public Double maxCost(List<Item> itemList) {
		Optional<Item> max = itemList.stream().max(Comparator.comparingDouble(Item::getCost));
		Item costOfMaxItem = max.get();
		return costOfMaxItem.getCost();
	}

	public List<String> getItemlist(List<Item> itemList) {
		List<String> getAllItems = itemList.stream().filter(item -> item.getCost() > 25000).map(item -> item.getName())
				.collect(Collectors.toList());
		return getAllItems;

	}

}

public class StreamProgram {

	public static void main(String[] args) {
		ArrayList<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "Soap", 50.09d));
		itemList.add(new Item(2, "TV", 25450d));
		itemList.add(new Item(3, "Pen", 20.09d));
		itemList.add(new Item(4, "Laptop", 50000.09d));
		itemList.add(new Item(5, "Books", 150.09d));

		ItemImplementation itemImplementation = new ItemImplementation();
		Double sum = itemImplementation.summationOfCost(itemList);
		System.out.println("The summation is: " + sum);

		Double maxCost = itemImplementation.maxCost(itemList);
		System.out.println("The cost of max item is: " + maxCost);

		List<String> allItems = itemImplementation.getItemlist(itemList);
		System.out.println("The all items names whose price are greater than 25000 are: ");
		allItems.forEach(System.out::println);

	}

}
