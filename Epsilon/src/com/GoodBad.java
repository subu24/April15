package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoodBad {
	
	public static void main(String[] args) throws Exception{
		

		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  int testCase=Integer.parseInt(br.readLine());
		  String[] arr=new String[testCase];
		  for(int i=0;i<testCase;i++){
			  String str=br.readLine();
			  int f1=0,f2=0;
			  int count=0;
			  char check='a';
			  for(int j=0;j<str.length();j++){
				  char ch=str.charAt(j);
				  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
					 count++;
					  if(count==1){
						  f1=1;
						  f2=1;
						  check=ch;
					  }
					  if(ch>check){
						f1++;  
					  }else if(ch<check){
						  f2++;
					  }
						  check=ch;
				  }
			  }
			  if(f1>1 && f2==1){
				  arr[i]="Good";
			  }
			  if(f1==1 && f2>1){
				  arr[i]="Worst";
			  }
			  if(f1==1 && f2==1){
				  arr[i]="Good";
			  }
			  if(f1>1 && f2>1){
				  arr[i]="Bad";
			  }
		  }
		  
		  for(int i=0;i<testCase;i++){
			  System.out.println(arr[i]);
		  }
	}

}
