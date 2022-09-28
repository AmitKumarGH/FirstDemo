package com.LearnJava.Program;

public class ParameterizeConstructor {
	String languages;
	ParameterizeConstructor(String lang){
		languages = lang;
		System.out.println(lang + " Programing Language");
	}
	public static void main(String[] args) {
		ParameterizeConstructor obj1 = new ParameterizeConstructor("Java");
		ParameterizeConstructor obj2 = new ParameterizeConstructor("Python");
		ParameterizeConstructor obj3 = new ParameterizeConstructor("C");
		
	}
}
