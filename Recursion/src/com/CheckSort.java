package com;

public class CheckSort {

	void checksortedorNot(int[] a, int index){
		if(index==1){
			System.out.println("sorted");
			return;
		}else {if(a[index-1]<a[index]){
			 checksortedorNot(a,index-1);
		}else{
			
			System.out.println("Not Sorted");
			return;
		}
		}
	}
	
	public static void main(String[] args) {

		CheckSort c=new CheckSort();
		int[] a=new int[] {3,4,5,6,7,8,9};
		int length=a.length;
		c.checksortedorNot(a,length-1);
	}

}
