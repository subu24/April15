package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CrazyTree {
	
	//Map<Integer, LinkedList<Node>> bTree= new HashMap<Integer, LinkedList<Node>>();
	int level;
	int[] nodes;
	void buildTree(int level){
		for(int i=0;i<(int) Math.pow(2, new Double(level-1));i++){
		nodes[i]=i+1;
		}
		int c=0;
		for(int i=((int) Math.pow(2, new Double(level-1)));i<((int) Math.pow(2, new Double(level)))-1;i++){
			nodes[i]=nodes[c]*nodes[c+1];
			c=c+2;
		}
	}
	
	int sumAll(int l,int first,int last){
		l=(level-1)%l;
		int sum=0;
		int x=(int) Math.pow(2, new Double(l-1));
		for(int i=x+first;i<=x+last;i++)
			sum=sum+nodes[i];
		
		return sum;
	}
	

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 CrazyTree tree=new CrazyTree();
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 tree.level = Integer.parseInt(st.nextToken());
		 int test = Integer.parseInt(st.nextToken());
		 tree.nodes=new int[(int) Math.pow(2, new Double(tree.level))];
		 tree.buildTree(tree.level);
		 int[] arr= new int[test];
		 for(int i=0;i<test;i++){
			 StringTokenizer st1 = new StringTokenizer(br.readLine());
			 int l = Integer.parseInt(st1.nextToken());
			 int first = Integer.parseInt(st1.nextToken());
			 int last = Integer.parseInt(st1.nextToken());
			 int sum=tree.sumAll(l, first, last);
			 arr[i]=sum;
		 }
		 for(int i=0;i<test;i++){
			 System.out.println(arr[i]);
		 }
	}

}
