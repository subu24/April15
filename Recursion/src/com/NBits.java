package com;

import java.util.Arrays;

public class NBits {
	
	int[] a=new int[4];

	void Bits(int n, int k){
		if(n<1)
			System.out.println(Arrays.toString(a));
		else{
		for(int j=0;j<k;j++){	
			a[n-1]=j;
			Bits(n-1,k);
		}}
	}
	public static void main(String[] args) {
		NBits nBits=new NBits();
		nBits.Bits(4,3);
	}

}
