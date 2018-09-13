package com;

public class PanagramCheck {
	public static void main(String[] args) {
		boolean a[]=new boolean[10];
		String str="The quick brown fox jumps over the lazy dog";
		int index=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c<'Z' && c>'A'){
				index=c-'A';
			}
			if(c<'z' && c>'a'){
				index=c-'a';
			}
			a[index]=true;
		}
		
	}

}
