package com;

import java.util.concurrent.RunnableScheduledFuture;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		next=null;
	}
}


public class LinkedList {
	
	 Node head;
	
	 Node detectLoop(){
		
		Node slow=head;
		Node fast=head;
		boolean loop=false;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				loop=true;
				break;
			}	
		}
		
		if(loop){
			slow=head;
			while(fast!=slow){
				fast=fast.next;
				slow=slow.next;
			}
			return fast;
		}else
		
		return null;
	}
	 
	 Node ReverseList(){
		 
		 Node current=head;
		 Node prev=null;
		 while(current!=null){
			 Node next=current.next;
			 current.next=prev;
			 prev=current;
			 current=next;
		 }
		 return prev;
	 }
	 
	
	 Node RecReverseList(Node curr,Node prev){
		 
		 if(curr.next==null){
			 head=curr;
			 curr.next=prev;
			 return null;
		 }
			Node next1=curr.next;
			curr.next=prev;
			prev=RecReverseList(next1,curr);
		 return head;
	 }
	 
	 
	 Node NthNodeFromLast(Node node,int nthNode){
		Node first=node;
		Node second=node;
		int count=0;
		while(first!=null) {
			count++;
			first=first.next;
			if(count==nthNode)
				break;
		}
		if(count<nthNode)
			return null;
		while(first!=null){
			first=first.next;
			second=second.next;
		}
		 return second;
	 }
	 
	 Node left;
	 boolean recPalindrom(Node root){
		 left=head;
		 
		 if(root==null)
			 return true;
		 
			boolean isP= recPalindrom(root.next);
			if(isP==false)
				return false;
			boolean isp1=left.data==root.data;
			
			
				left=left.next; 
			return isp1;
	 }
	 
	/* int getIntersectionCode(int d, Node node1,Node node2){
		 
	 }*/
	 
	static Node sumNode;
	 boolean addTwoNumber(Node s1,Node s2, int c){
		 int x=0,y=0;
		 if(s1==null && s2==null){
			
				Node temp=new Node(c);	
				 temp.next=sumNode;
					sumNode=temp;
			return true;
		 }
		if(s1!=null)
			x=s1.data;
		if(s2!=null)
			y=s2.data;
		int sum=x+y+c;
		int s=sum%10;
		c=sum/10;
		Node temp=new Node(s);
		if(sumNode==null)
			sumNode=temp;
		else{
		temp.next=sumNode;
		sumNode=temp;
		}
		 return addTwoNumber(s1.next, s2.next,c);
	 }
	 
	 void push(int data){
		 Node node=new Node(data);
		 node.next=head;
		 head=node;
	 }
	 void pushr(int data){
		 Node node=new Node(data);
		 node.next=result;
		 result=node;
	 }
	void display(){
		while(result!=null){
			System.out.println(result.data);
			result=result.next;
		}
	}

	int carry;
	Node head1,head2,result;
	LinkedList addList(Node head1,Node head2){
		if(head1==null){
			result=head1;
			return null;
		}
		if(head2==null){
			result=head2;
			return null;
		}
		int l1=getSize(head1);
		int l2=getSize(head2);
		Node temp1, temp2;
		int dif=0;
		if(l1>l2){
			temp1=head1;
			temp2=head2;
			dif=l1-l2;
		}else{
			temp1=head2;
			temp2=head1;
			dif=l2-l1;
		}
		Node h1=temp1;
		 while(dif>0){
			 temp1=temp1.next;
			 dif--;
		 }
		int carry=addRec(temp1,temp2);
		if(carry!=0){
			int c=addCarry(h1,temp1);
			
		if(c!=0)
			pushr(1);
		}
		return null;
	}
	private int addCarry(Node h1, Node temp1) {
		if(h1==temp1)
			return 1;
		int sum=h1.data+addCarry(h1.next, temp1);
		pushr(sum%10);
		return sum/10;
	}

	private int addRec(Node temp1, Node temp2) {
		if(temp1!=null && temp2!=null)
			return 0;
		int sum=temp1.data+temp2.data+addRec(temp1.next, temp2.next);
		pushr(sum%10);
		return sum/10;
	}

	private void addSameSize(Node h12, Node h22) {
		if(h12==null)
			return;
		
		addSameSize(h12,h22);
		int sum=h12.data+h22.data+carry;
		
	}

	private int getSize(Node head12) {
		int count=0;
		while(head12!=null){
			head12=head12.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		LinkedList list1=new LinkedList();
		list1.push(9);
		list1.push(7);
		LinkedList list2=new LinkedList();
		list2.push(9);
		list2.push(8);
		list2.push(7);
		//list.head.next.next.next=list.head.next;
		list1.addList(list1.head,list2.head);
		/*while(sumNode!=null){
			System.out.print(sumNode.data);
			sumNode=sumNode.next;
		}*/
		list1.display();
	}

}