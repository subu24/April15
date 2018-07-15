package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Skip5 {

	public static void main(String[] args) throws IOException{

		/*System.out.println(IntStream.range(1, 20)
		.skip(10)
		.sum());*/
		/// 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		
		Arrays.stream(names)
		.filter(x->x.startsWith("A"))
		.sorted()
		.forEach(System.out:: println);
		
		/*List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");

		people
			.stream()
			.map(String::toLowerCase)
			.filter(x->x.startsWith("a"))
			.sorted()
			.forEach(System.out::println);*/
		
		
		/*try {
			List<String> bands = Files.lines(Paths.get("E:\\April15\\Java8Stream\\band.txt"))
			.filter(x->x.contains("son"))
			.collect(Collectors.toList());
			
			bands.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
				
		Stream<String> row=Files.lines(Paths.get("E:\\April15\\data.txt"));
		/*int rowCount=(int)row
				.map(x->x.split(","))
				.filter(x->x.length==3)
				.count();*/
		Map<String, Integer> hMap=new HashMap<String,Integer>();
		hMap=row.map(x->x.split(","))
		.filter(x->x.length==3)
		//.filter(x->Integer.parseInt(x[1])>15)
		//.forEach(x-> System.out.println(x[0]+" "+x[1]+" "+x[2]));
		.collect(Collectors.toMap(
				x->x[0], x->Integer.parseInt(x[1])));
		row.close();
		
		for(String key: hMap.keySet()){
			System.out.println(key+"  "+hMap.get(key));
		}
		
		
		
		
	}

}
