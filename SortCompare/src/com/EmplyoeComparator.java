package com;

import java.util.Comparator;

public class EmplyoeComparator  implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int empName=o1.getName().compareTo(o2.getName());
		
		if(empName==0){
			return o1.getSalary()-o2.getSalary();
		}else
		return empName;
	}

}
