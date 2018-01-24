package com.igeekhome.tankwar.j2se11_29;

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
		Car car1=new Car("BMW",2000);
		car1.start();
		car1.stop();
		
		Bicycle laofenghuang=new Bicycle();
		laofenghuang.setName("老凤凰");
		laofenghuang.start();
		laofenghuang.stop();
		
		Bicycle jiante=new Bicycle("吉安特",200,"人力",2);
		jiante.start();
		jiante.stop();
		jiante.push();
		
		Bicycle b=new Bicycle();
		b.start();
	}

}
