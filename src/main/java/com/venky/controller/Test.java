package com.venky.controller;



import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		
		String input = "3 4 3 1 6 7";
		
		int[] data = parseStringToList(input);
		
		if(data.length<3) {
			 System.out.println("Not Found");
		}
		else {
			System.out.println(data[data.length-3]);
		}
		
		
		
	}
	
	static int[] parseStringToList(String stringInput) {
		String[] parseString = stringInput.split(" ");
		
		int[] arrayA = new int[parseString.length];
		
		for(int i=0; i < parseString.length; i++) {
			arrayA[i] =  Integer.parseInt(parseString[i]);
		}
		Arrays.sort(arrayA);
		return arrayA;
	}

}
