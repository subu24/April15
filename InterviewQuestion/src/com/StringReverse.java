package com;

class child1{
	 void fun(){
		System.out.println("I m in child1111");
	}
	
}


class child2 extends child1{
	void fun2(){
		System.out.println("I m in child2222");
	}
	
}
public class StringReverse extends child1 {
	
	 void fun(){
		System.out.println("I m in StringReverse");
	}

		String combination(String str,int s,int l){
			
		return null;
	}

		
		void method(double d, int i){
			System.out.println("di");
		}
		void method(int i, double d){
			
			System.out.println("id");
		}
		void method(String s1, String s2){
			System.out.println("SS");
		}
	public static void main(String[] args) {

		/*String str="";
		String s="", s1="";
		String[] a=str.split(" ");
		
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			s=s+c;
			if(c==' '){
			s1=s+s1;
			s="";
			} 
		}
		s1=s+" "+s1;
		System.out.println(s1);
		*/
		StringReverse st=new StringReverse();
		st.fun();;
		//st.fun();
		
		//child2 c=new child2();
		//child1 c1=new child2();
		//c1.fun();
		//c.
	}

}
