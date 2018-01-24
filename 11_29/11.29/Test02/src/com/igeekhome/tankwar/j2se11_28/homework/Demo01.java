package com.igeekhome.tankwar.j2se11_28.homework;

import java.util.Scanner;

/**
 * 
 * @author student
 *  
 */
public class Demo01 {

	/**
	 * 定义一个数组，输入一个数,查找这个数在其中的位置
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr={12,3,321,3,54,32,5434,545,643,6,6,54,3,12,3};
		int num=3;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				System.out.println(num+"出现在第"+(i+1)+"个位置");
			}
		}
	}

}
