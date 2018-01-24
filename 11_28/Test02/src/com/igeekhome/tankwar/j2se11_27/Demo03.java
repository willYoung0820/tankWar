package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo03 {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
			
		int a=10;
		int b=15;
		System.out.println(a>b);
		System.out.println(a>5);
		
		System.out.println(a>b&&a<10);
		System.out.println(a>b||a<=10);
		System.out.println(!true);
		
		int max=a>b?a:b;
		System.out.println("max="+max);

	}

}
