package com.igeekhome.tankwar.j2se11_29;

/**
 * 定义一个动物类Animal,定义2个子类Cat、Dog，请按照OOP的设计原则设计这3个类
 * @author student
 *
 */
public class Demo04 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal1=new Dog();
		animal1.cry();
		
		Animal animal2=new Cat();
		animal2.cry();
	}

}
