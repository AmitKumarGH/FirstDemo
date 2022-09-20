package com.LearnJava.Program;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "First character to lower case";
	    
        System.out.println( firstCharToLowerCase(str) );
    }
 
    private static String firstCharToLowerCase(String str) {
        
        if(str == null || str.length() == 0)
            return "";
        
        if(str.length() == 1)
            return str.toLowerCase();
        
        char[] chArr = str.toCharArray();
        chArr[0] = Character.toLowerCase(chArr[0]);
        
        return new String(chArr); 
    }
}
}
