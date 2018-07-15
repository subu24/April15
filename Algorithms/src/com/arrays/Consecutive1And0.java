package com.arrays;

public class Consecutive1And0 {
	
	static void consequtive(int[] a){
		int count1=0;
		int count0=0;
		int prev=9999;
		int result0=0;
		int result1=1;
		for(int i=0;i<a.length;i++){
			if(a[i]==0 && prev==0){
				count0=count0+1;
			}else{
				result0=Math.max(count0, result0);
				count0=1;
			}
			if(a[i]==1 && prev==1){
				count1=count1+1;
			}else{
				result1=Math.max(count1, result1);
				count1=1;
			}
		prev=a[i];		
		}
		
		System.out.println("0 ="+result0 +"1 ="+result1);
	}

	public static void main(String[] args) {
		 int[] a=new int[]{1,0,0,1,1,1,1,0,0,0,1,0,1,};
		 consequtive(a);
		
	}

}
