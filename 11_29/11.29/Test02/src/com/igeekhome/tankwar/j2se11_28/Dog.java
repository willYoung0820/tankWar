package com.igeekhome.tankwar.j2se11_28;

/**
 * 类Dog
 * @author student
 *
 */
public class Dog {
	//属性
	private String name;
	private String sex;
	private int age;
	private String color;
	//方法
	public void cry(){
		System.out.println(name+"在cry");
	}
	
	//this:当前对象
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}
