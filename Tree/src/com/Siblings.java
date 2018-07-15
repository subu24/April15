package com;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	
	int data;
	Node right,left;
	Node(int data){
		this.data=data;
		right=left=null;
	}
	
}

public class Siblings {
	

	
	Node root;
	
	boolean isSiblings(Node node,Node a,Node b){
		if(node==null)
			return false;
		boolean x = false, y = false, z = false;
		if(node.left!=null && node.right!=null){
		
		 x=(node.left==a && node.right==b) || (node.left==b && node.right==a);
		
		 if(node.left!=null)
		 y=isSiblings(node.left,a,b);
		 
		 if(node.right!=null)
		 z=isSiblings(node.right,a,b);
		
		}
		return (x|| y|| z);
		
	} 
	
	
	int level(Node node,Node ptr,int lev){
		if(node==null)
			return 0;
		
		if(node==ptr)
			return lev;
		int l=level(node.left, ptr, lev+1);
		if(l>0)
			return l;
		
		return level(node.right, ptr, lev+1);
	}

	boolean isCousine(Node node,Node a,Node b){
		
		return ((level(node,a,1)==level(node,b, 1)) && (!isSiblings(node, a, b)));
	}
	
	void isBalancedTree(){
		
	}
	
	int isHeightBalace (Node root) {
		if (root == null) return 0;

		int leftHeight = isHeightBalace (root.left);
		if (leftHeight == -1) return -1;
		int rightHeight = isHeightBalace (root.right);
		if (rightHeight == -1) return -1;

		if (Math.abs(leftHeight - rightHeight) > 1) return -1;
		return Math.max (leftHeight, rightHeight) + 1;
		}
	void printLevelOrder(Node node){
		if(node==null)
			return ;
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(node);
		
		while(true){
			System.out.println();	
		int nodeCount=q.size();
		if(nodeCount==0)
			break;
		
		while(nodeCount>0){
			Node item=q.poll();
			
			System.out.print(" "+item.data);
			//q.remove();
			if(item.left!=null){
				q.add(item.left);
			}	
			if(item.right!=null){
			    q.add(item.right);
			}
			
			nodeCount--;
		}
			
		}
		
	}
	
	public static void main(String[] args) {

		Siblings tree = new Siblings();
		
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.left.right.left = new Node(15);
        tree.printLevelOrder(tree.root);
        
        int h=tree.isHeightBalace(tree.root);
        
        if(h<1)
        	System.out.println("NOT BS");
        
        else
        	System.out.println("BBS");
   /*     Node Node1, Node2;
        Node1 = tree.root.left.left;
        Node2 = tree.root.right.left.right;
        
        if (tree.isCousine(tree.root, Node1, Node2))
            System.out.println("Yes");
        else
            System.out.println("No");*/
	}

}
