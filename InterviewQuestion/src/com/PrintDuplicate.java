package com;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] arr=new int[]{4,5,5,9,5,5,8,5,5,8,9};
		findDup(arr);
	}
static void findDup(int[] arr){
	Map<Integer, Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++){
		if(map.containsKey(arr[i])){
			map.put(arr[i], map.get(arr[i])+1);
		}else{
			map.put(arr[i], 1);
		}
	}
	for(Map.Entry<Integer, Integer> entry: map.entrySet()){
		if(entry.getValue()>1)
			System.out.println(entry.getKey());
	}
}

}
