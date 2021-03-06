package com;

/*class Node{
	
	int data;
	Node left,right;
	
	Node(int item){
		data=item;
		left=right=null;
	}
}*/

public class BinarySearchTree {
	

	
	Node deleteNode(Node root,int key){
		if(root==null)
			return root;
		
		if(key<root.data)
			root.left=deleteNode(root.left,key);
		else if(key>root.data)
			root.right=deleteNode(root.right, key);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			root.data=findmin(root.right);
			
			root.right=deleteNode(root.right, root.data);
		}
		return root;
	}
	
	
	private int findmin(Node root) {
		int min=root.data;
		while(root.left!=null){
			min=root.left.data;
			root=root.left;
		}
		return min;
	}


	private void insertItem(int i) {
		
	}
	public static void main(String[] args) {
		
		BinarySearchTree test=new BinarySearchTree();
		test.insertItem(50);
        test.insertItem(20);
        test.insertItem(80);

        test.insertItem(70);

        test.insertItem(10);

        test.insertItem(30);

        test.insertItem(60);

       // test.inorderTrav();

        System.out.println("//////////////////////////////");

       // test.deleteItem(10);

       // test.inorderTrav();

        System.out.println("//////////////////////////////");
 

      //  boolean b=test.isBBBST();

       // System.out.println(b);

      //  test.verticalOrder(test.root,0);

       // test.printMap();
	}



}
