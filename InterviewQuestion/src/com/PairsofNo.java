package com;

import java.util.HashMap;

public class PairsofNo {
	
	int pairsOfNo(int[] a,int k){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		 for (int i=0; i<a.length; i++){
	            if(!map.containsKey(a[i]))
	                map.put(a[i],0);  
	            else
	            map.put(a[i], map.get(a[i])+1);
	        }
		 int count=0;
		 for(int i=0;i<a.length;i++){
			 if(map.get(k-a[i])!=null)
			 count += map.get(k-a[i]);	           
		 }
		 return count/2;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
