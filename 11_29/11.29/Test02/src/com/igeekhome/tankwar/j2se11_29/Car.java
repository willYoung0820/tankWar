package com.igeekhome.tankwar.j2se11_29;

/**
 * 小汽车类
 * 父类元素中protected、public元素可以被继承到子类
 * @author student
 *
 */
public class Car extends Vehicles{
	//super关键字可以调用父类中的元素(构造器super()、方法super.方法名()) 
	public Car(String name,double weight){
		super(name,weight);
	}
}
