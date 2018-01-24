package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo05 {
	
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
		//
		int i=(int)(Math.random()*101);
		System.out.println(i);

//		//
//		if(i>=0&&i<60){
//			System.out.println("E");
//		}else if(i>=60&&i<70){
//			System.out.println("D");
//		}else if(i>=70&&i<80){
//			System.out.println("C");
//		}else if(i>=80&&i<90){
//			System.out.println("B");
//		}else if(i>=90&&i<=100){
//			System.out.println("A");
//		}
		
		//
		if(i<60){
			System.out.println("E");
		}else if(i<70){
			System.out.println("D");
		}else if(i<80){
			System.out.println("C");
		}else if(i<90){
			System.out.println("B");
		}else{
			System.out.println("A");
		}
	}

}
