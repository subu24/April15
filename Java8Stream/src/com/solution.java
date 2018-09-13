package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int r=Integer.parseInt(br.readLine());
		int[] temp=new int[5];
		char result[]= new char[r];
		for(int j=0;j<r;j++){
		int n=Integer.parseInt(br.readLine());
		String binaryString = Integer.toBinaryString(n);
		System.out.println(binaryString);
		char a[]=binaryString.toCharArray();
		int l=a.length;
		for(int i=0;i<l;i++){
			char t=a[i]=='0'?'1':'0';
			if(i>0)
				a[i-1]= a[i-1]==a[i]?t:a[i-1];
			if(i<l-1)
				a[i+1]= a[i+1]==a[i]?t:a[i+1];
			
			a[i]=t;	
		}
		binaryString= new String(a);
		int con=Integer.parseInt(binaryString,2);
		temp[j]=con;
		if(l%2==0){
			if(n==con || n==con-1 || n==con+1)
				result[j]='Y';
			else
				result[j]='X';
		}
		if(l%2!=0){
			if(n==con || n==con-1 || n==con+1)
				result[j]='X';
			else
				result[j]='Y';
		}	
		
		}
		for(char c:result){
			System.out.println(c);
		}
		for(int m:temp)
			System.out.println(m);
		
	}
}
