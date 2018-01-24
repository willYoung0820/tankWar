package com.igeekhome.tankwar.j2se11_28;

/**
 * 
 * @author student
 *
 */
public class Demo01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//类的使用：实例化
		Dog hashiqi=new Dog();
		Dog taidi=new Dog();
		Dog bandian=new Dog();
		//
		hashiqi.setName("哈士奇");
		hashiqi.cry();
		System.out.println(hashiqi.getName());
		
		taidi.setName("泰迪");
		taidi.cry();
		System.out.println(taidi.getName());
	}

}
