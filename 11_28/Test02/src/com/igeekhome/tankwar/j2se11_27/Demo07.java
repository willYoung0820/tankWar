package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo07 {
	
	/**
	 * for(��ʼֵ1;����2;��ִ�����3){
	 * 		����4
	 * }
	 *  1  243 243 243 ... 243  2 exit
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		
		for(int i=2;i<=10;i+=2){
			System.out.println(i);
		}
		
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}

}
