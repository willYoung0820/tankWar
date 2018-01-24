package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo04 {
	
	/**
	 *  if
	 * @param args
	 */
	public static void main(String[] args) {
		//
		int i=(int)(Math.random()*100);
		System.out.println(i);

		if(i%2==0){
			System.out.println(i+"是偶数");
		}else{
			System.out.println(i+"是奇数");
		}
	}

}
