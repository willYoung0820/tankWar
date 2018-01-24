package com.igeekhome.tankwar.j2se11_28;

/**
 * 
 * @author student
 *
 */
public class Demo03 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//调用无参数的构造器
		Rectangle rect1=new Rectangle(0,0,20,20);
		Rectangle rect2=new Rectangle(20,20,20,20);
		
		Rectangle rect3=new Rectangle(50,50,20,20);
		
		System.out.println(rect1.isIntersect(rect2));
		System.out.println(rect2.isIntersect(rect3));
	}

}
