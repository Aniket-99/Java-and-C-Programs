package com.java.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue {

	public static void main(String[] args) {

        //HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

//        hm.put("Math", 98); 
//        hm.put("Data Structure", 85); 
//        hm.put("Database", 91); 
//        hm.put("Java", 95); 
//        hm.put("Operating System", 79); 
//        hm.put("Networking", 80); 
        hm.put(12,"Math"); 
        hm.put(10,"Data Structure"); 
        hm.put(2,"Database"); 
        hm.put(23,"Java"); 
        hm.put(133,"Operating System"); 
        hm.put(123,"Networking"); 
        Map<Integer,String> hm1 = sortByValue(hm);
        for(Map.Entry<Integer,String> entry:hm1.entrySet()) {
        	System.out.println(entry.getKey()+":"+entry.getValue());
        }
	}
	
	public static HashMap<Integer,String> sortByValue(HashMap<Integer,String> hashMap){
		List<Map.Entry<Integer,String>> list = new LinkedList<Map.Entry<Integer,String>>(hashMap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer,String> obj1, Entry<Integer,String> obj2) {
				
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		
		
		HashMap<Integer,String> temp = new LinkedHashMap<>();
		for(Map.Entry<Integer,String> val : list) {
			temp.put(val.getKey(), val.getValue());
		}
		return temp;
		
		
	}
}
