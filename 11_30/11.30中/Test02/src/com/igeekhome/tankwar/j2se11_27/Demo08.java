package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo08 {
	
	/**
	 * for(初始值1;条件2;再执行语句3){
	 * 		语句块4
	 * }
	 *  1  243 243 243 ... 243  2 exit
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i>5&&i<8){
//				break;//跳出本循环，程序块结束
//				continue;//跳出本次循环,循环继续下一次
			}
			System.out.println(i);
		}

		
//		for(int i=1;i<=10;i++){
//			for(int j=20;j<=30;j++){
//				if(j>=25){
//					break;
//				}
//			}
//		}
	}

}
