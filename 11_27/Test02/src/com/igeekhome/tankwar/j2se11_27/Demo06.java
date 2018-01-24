package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo06 {
	
	/**
	 *  随机生成一个随机分数，输出对应的等级
	 *  [0-60)  E
	 *  [60,70) D
	 *  [70,80) C
	 *  [80,90) B
	 *  [90,100] A
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		//switch只能匹配常量
		int i=(int)(Math.random()*101);
		System.out.println(i);

		switch(i/10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("E");
				break;
			case 6:
				System.out.println("D");
				break;
			case 7:
				System.out.println("B");
				break;
			case 8:
				System.out.println("C");
				break;
			case 9:
			case 10:
				System.out.println("A");
				break;
		}
	}

}
