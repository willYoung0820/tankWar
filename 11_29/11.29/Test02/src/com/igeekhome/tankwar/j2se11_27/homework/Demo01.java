package com.igeekhome.tankwar.j2se11_27.homework;

import java.util.Scanner;

/**
 * 输入3个数字,输出其中的最大的值
 * @author student
 *  
 */
public class Demo01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int max;
		
//		if(num1>num2){
//			max=num1;
//		}else{
//			max=num2;
//		}
//		
//		if(num3>max){
//			max=num3;
//		}
		
		max=num1>num2?num1:num2;
		max=num3>max?num3:max;
//		
		System.out.println("max:"+max);
	}

}
