package com;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {

		int testCase;
		Scanner sc= new Scanner(System.in);
		testCase=sc.nextInt();
		String arr[]=new String[testCase];
		for(int i=0;i<testCase;i++){
		int zero=sc.nextInt();
		int one=sc.nextInt();
		int countOne=0;
		int countZero=0;
		int length=sc.nextInt();
		String binary=sc.next();
		for(int j=0;j<length;j++){
			char ch=binary.charAt(j);
			if(ch=='0')
				countZero++;
			if(ch=='1')
				countOne++;
		}
		if(countOne==length && zero>0)
			arr[i]="NO";
		else if(zero==0 && one == 0)
			arr[i]="NO";
		else if(zero>0 && countZero%zero==0 && one == 0)
			arr[i]="YES";
		else if(zero==0 && one>0 && countOne%one==0)
			arr[i]="YES";
		else if(countZero%zero==0 && countOne%one==0){
			int zc=countZero/zero;
			int oc=countOne/one;
			System.out.println(zc+" "+oc);
			if(zc==oc )
			arr[i]="YES";
			else if(zc+1==oc)
				arr[i]="YES";
			else
				arr[i]="NO";
		}else
			arr[i]="NO";
		}
		for(int i=0;i<testCase;i++){
			System.out.println(arr[i]);
		}
	}

}