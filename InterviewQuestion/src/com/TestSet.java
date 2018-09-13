package com;

import java.util.HashMap;
import java.util.Map;

public class TestSet {

	public static void main(String[] args) { 
		Employee emp1=new Employee(101, "SUBU");
		Employee emp2=new Employee(101, "SUBU");
		Employee emp3=new Employee(103, "SUBU");
		Employee emp4=new Employee(104, "SUBU");
		Employee emp5=new Employee(105, "SUBU");
		
		Map<Employee,Employee> map=new HashMap<Employee,Employee>();

		map.put(emp1, emp1);
		map.put(emp2, emp2);
		map.put(emp3, emp3);
		map.put(emp4, emp4);
		map.put(emp5, emp5);
		
		for(Map.Entry<Employee, Employee> entry:map.entrySet()){
			System.out.println(entry.getKey());
		}
	}

}
