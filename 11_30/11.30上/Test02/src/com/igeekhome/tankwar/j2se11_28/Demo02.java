package com.igeekhome.tankwar.j2se11_28;

/**
 * 
 * @author student
 *
 */
public class Demo02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//�����޲����Ĺ�����
		Rectangle rect=new Rectangle();
		
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
		
		System.out.println("-----------------");
		
		Rectangle rect2=new Rectangle(15,25);
		System.out.println(rect2.getX());
		System.out.println(rect2.getY());
		System.out.println(rect2.getWidth());
		System.out.println(rect2.getHeight());
		
		//error
		//Rectangle rect3=new Rectangle(15);
		
	}

}
