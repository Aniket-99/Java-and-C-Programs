package com.java.practice;
import java.util.*;
public class SortingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();  
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
		sortByKey(hm);
		sortByValue(hm);
	}
	
	public static void sortByKey(HashMap<Integer,String> hashMap) {
		TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);
		
		for(Map.Entry entry:sortedMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}	
	
	public static void sortByValue(HashMap<Integer, String> hashMap) {
		List list = new LinkedList(hashMap.entrySet());
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
			}
		});
		
		HashMap sortedHashMap = new LinkedHashMap();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		
		Set set = sortedHashMap.entrySet(); 	
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
