package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmplyoeeTest {

	public static void main(String[] args) {

		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		 
        // create Employee objects using constructor initialization
        Employee cust1 = new Employee(1, "Chennai", 60);
        Employee cust2 = new Employee(2, "Pune",  73);
        Employee cust3 = new Employee(3, "Bangalore", 37);
        Employee cust4 = new Employee(4, "Hyderabad", 52);
        Employee cust5 = new Employee(5, "Chennai", 70);
        Employee cust6 = new Employee(6, "Bangalore", 48);
        Employee cust7 = new Employee(7, "Mangalore", 45);
        Employee cust8 = new Employee(8, "Pune", 62);
        Employee cust9 = new Employee(9, "Chennai",  50);
        
        listOfEmployees.add(cust1);
        listOfEmployees.add(cust2);
        listOfEmployees.add(cust3);
        listOfEmployees.add(cust4);
        listOfEmployees.add(cust5);
        listOfEmployees.add(cust6);
        listOfEmployees.add(cust7);
        listOfEmployees.add(cust8);
        listOfEmployees.add(cust9);
        
        Collections.sort(listOfEmployees, new EmplyoeComparator());
        for(Employee customer : listOfEmployees) {
            System.out.println(customer);
        }
	}

}
