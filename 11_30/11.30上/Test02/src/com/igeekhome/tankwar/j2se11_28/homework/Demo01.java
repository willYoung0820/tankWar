package com.igeekhome.tankwar.j2se11_28.homework;

import java.util.Scanner;

/**
 * 
 * @author student
 *  
 */
public class Demo01 {

	/**
	 * ����һ�����飬����һ����,��������������е�λ��
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr={12,3,321,3,54,32,5434,545,643,6,6,54,3,12,3};
		int num=3;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				System.out.println(num+"�����ڵ�"+(i+1)+"��λ��");
			}
		}
	}

}
