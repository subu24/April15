package com.travarsal;

import java.util.LinkedList;

public class DFSGraph {
	
	private int V;
	private LinkedList<Integer>[] adjList;
	
	public DFSGraph(int v) {
		V=v;
		adjList=new LinkedList[v];
		for(int i=0;i<adjList.length;i++){
			adjList[i]=new LinkedList();
		}
	}
	
	void BFSUtill(int n){
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
