package com.igeekhome.tankwar.j2se11_29;

/**
 * static ：静态修饰符
 * 		静态成员属于类，而不属于类的实例
 * 		静态成员可以通过类来访问，也可以通过类的实例来访问
 * @author student
 *
 */
public class Demo05 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {			
		System.out.println(GameScreen.V);
		
		GameScreen gs1=new GameScreen();
		gs1.V++;
		System.out.println(gs1.V);
		GameScreen gs2=new GameScreen();
		System.out.println(gs2.V);
		
	}

}
