package com;

class Base {
	private void foo() {System.out.println("Base");}
}
 
class Derived extends Base {
	public void foo() {System.out.println("Derived");} // works fine
}
 
public class Main {
    public static void main(String args[]) {
    	/*Derived d = new Base();
        d.foo();*/
    }
}