package com.igeekhome.tankwar.j2se11_28;

/**
 * ��Dog
 * @author student
 *
 */
public class Dog {
	//����
	private String name;
	private String sex;
	private int age;
	private String color;
	//����
	public void cry(){
		System.out.println(name+"��cry");
	}
	
	//this:��ǰ����
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}
