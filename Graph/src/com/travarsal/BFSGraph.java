package com.travarsal;

import java.util.LinkedList;
import java.util.ListIterator;

public class BFSGraph {
	
	private int V;
	private LinkedList<Integer> adjList[];
	
	public BFSGraph(int v) {
		V=v;
		adjList=new LinkedList[v]; 
		for(int i=0;i<v;i++){
			
			adjList[i]=new LinkedList();
		}
	}
	
	void addEdge(int v,int w){
		adjList[v].add(w);
	}
	
	void BFS(int node){
		 LinkedList<Integer> queue= new LinkedList<Integer>();	
		 boolean[] visit=new boolean[V]; 
		 queue.add(node);
		 visit[node]=true;
		 while(!queue.isEmpty()){
			 node=queue.poll();
			 System.out.println(node);
			 ListIterator<Integer> lst=adjList[node].listIterator();
			 while(lst.hasNext()){
				 int n=lst.next();
				 if(!visit[n]){
					 visit[n]=true;
					 queue.add(n);
				 }
			 } 
		 }
	}

	public static void main(String[] args) {
		 BFSGraph g = new BFSGraph(4);
		 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFS(2);
	}

}
