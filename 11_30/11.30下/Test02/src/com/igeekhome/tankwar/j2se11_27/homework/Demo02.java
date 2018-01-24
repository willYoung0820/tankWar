package com.igeekhome.tankwar.j2se11_27.homework;

import java.util.Scanner;

/**
 * 24 16
 * 16 8
 * 8  0
 * @author student
 *
 */
public class Demo02 {

	/**
	 * 输入2个数，输出他们的最大公约数和最小公倍数
	 * 24 16
	 * 最大公约数:8
	 * 最小公倍数:48
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		int min=num1>num2?num2:num1;
		int max=num1>num2?num1:num2;
		
		int t=1;
		for(int i=1;i<=min;i++){
			if(num1%i==0&&num2%i==0){
				t=i;
			}
		}
		
		System.out.println(num1+"与"+num2+"的最大公约数:"+t);
		System.out.println(num1+"与"+num2+"的最小公倍数:"+num1*num2/t);
	}

}
