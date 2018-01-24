package com.igeekhome.tankwar.j2se11_29;

public class Dog extends Animal {
	
	public void cry(){
		System.out.println(name+"---cry---");
	}
	
	public void eat(){
		System.out.println(name+"---eat meat!---");	
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}
}
