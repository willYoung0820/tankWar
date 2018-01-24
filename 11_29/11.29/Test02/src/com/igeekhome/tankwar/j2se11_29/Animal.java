package com.igeekhome.tankwar.j2se11_29;

public class Animal {
	protected String name;
	protected int age;
	protected String sex;
	
	public Animal(){
		
	}
	
	public Animal(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void cry(){
		
	}
	
	public void eat(){
		
	}
}
