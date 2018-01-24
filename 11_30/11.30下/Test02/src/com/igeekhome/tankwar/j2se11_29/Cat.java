package com.igeekhome.tankwar.j2se11_29;

public class Cat extends Animal {
	
	
	public void cry(){
		System.out.println(name+"---cry!---");	
	}
	
	public void eat(){
		System.out.println(name+"---eat fish!---");		
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}
}
