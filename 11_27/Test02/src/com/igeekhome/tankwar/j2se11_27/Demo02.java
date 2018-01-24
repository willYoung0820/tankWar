package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo02 {
	
	/**
	 * 输入一个四位数，输出个、十、百、千位的数字
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		//1234
		int one=num%10;
		int ten=num/10%10;	
		int hundred=num/100%10;
		int thousand=num/1000;
		
		System.out.println("个位:"+one);
		System.out.println("十位:"+ten);
		System.out.println("百位:"+hundred);
		System.out.println("千位:"+thousand);
	

	}

}
