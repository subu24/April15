package com;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;


public class PrintNo {

	public static void main(String[] args) throws IOException{
		
		String[] names = {"asa2341", "aaa434", "uio879", "rty456", "Sar986", "tyt6789"};
		Arrays.stream(names)	// same as Stream.of(names)
			.map(x->x.substring(3, x.length()))
			.map(x->Integer.valueOf(x))
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
			/*.findFirst()
			.ifPresent(System.out:: println);
			*/
	}

}
