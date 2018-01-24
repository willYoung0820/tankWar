package com.igeekhome.tankwar.j2se11_28.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author student
 *  
 */
public class Demo02 {

	/**
	 * 定义一个子弹类,位置随机
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		
		Bullet b=new Bullet();
		b.setX(r.nextInt(100));
		b.setY(r.nextInt(100));
		b.setWidth(20);
		b.setHeight(5);
		
		System.out.println(b.getX());
		System.out.println(b.getY());
		System.out.println(b.getWidth());
		System.out.println(b.getHeight());
	}

}
