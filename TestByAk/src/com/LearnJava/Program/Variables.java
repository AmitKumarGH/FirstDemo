package com.LearnJava.Program;

public class Variables {
	
	static int m=100;//static variable  
     void method()  
    {    
        int n=90;//local variable  
        System.out.println("Local="+n);
    }  
	
	public static void main(String[] args) {
		int data=50;//instance variable    
		
		System.out.println("Static="+m);
		
		System.out.println("Instance="+data);
		
		//method();
		
		Variables var = new Variables();
		var.method();
		
		
	}

}
