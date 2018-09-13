package com;

public class SpclRev {
	
	public static void main(String[] args) {
		
		String str="s$sau@ty@o";
		char[] a= str.toCharArray(); 
		int l=0,r=a.length-1;
		while(l<r){
			if(Character.isAlphabetic(a[l]) && Character.isAlphabetic(a[r])){
				char t=a[l];
				a[l]=a[r];
				a[r]=t;
				l++;
				r--;
			}
			if(!Character.isAlphabetic(a[l])){
				l++;
			}
			if(!Character.isAlphabetic(a[r])){
				r--;
			}
		}
		
	
		System.out.println(String.copyValueOf(a));
	}

}
