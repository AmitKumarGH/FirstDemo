package com.LearnJava.Program.assignment;

public class ClassEx {
	
	boolean isOn;
	void turnOn()
	{
		isOn = true;
		System.out.println("Light on?"+isOn);
	}
	void turnOff() {
		isOn = false;
		System.out.println("Light on?"+isOn);
	}
	public static void main(String[] args) {
		ClassEx led = new ClassEx();
		ClassEx halogen = new ClassEx();
		led.turnOn();
		halogen.turnOff();
	}
}
