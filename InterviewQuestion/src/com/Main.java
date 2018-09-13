package com;

class parent1 {
	public void foo() {System.out.println("Base");}
}
 
class child extends parent1 {
	public void foo() {System.out.println("Derived");} // works fine
}
 
public class Main {
    public static void main(String args[]) {
    	parent1 d= new parent1();
        d.foo();
    }
}