package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[] args) {

	List<String> vowels = new ArrayList<>();

	vowels.add("A"); // [A]
	vowels.add("E"); // [A, E]
	vowels.add("U"); // [A, E, U]
	vowels.remove(vowels.size()-1);
	System.out.println(vowels);
}
}
