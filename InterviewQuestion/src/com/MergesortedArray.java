package com;

import java.util.Arrays;

public class MergesortedArray {

	static int[] b=new int[20];
	public static void main(String[] args) {
		int[] arr1=new int[]{3,6,9,12};
		int[] arr2=new int[]{4,5,5,5,5,5,5,5,5,8};
		MergesortedArray m=new MergesortedArray();
		m.merge(arr1,arr2);
		System.out.println(Arrays.toString(b));
	}

	void merge(int[] arr1, int[] arr2){
		int i,j,k=0,m,n;
		for( i=0,j=0;i<arr1.length && j<arr2.length;  ){
			if(arr1[i]<arr2[j]){
				b[k++]=arr1[i++];
			}else{
				b[k++]=arr2[j++];
			}
		}
		for(m=i;m<arr1.length;m++){
			b[k++]=arr1[m];
		}
		for(n=j;n<arr2.length;n++){
			b[k++]=arr2[n];
		}
	} 
}
