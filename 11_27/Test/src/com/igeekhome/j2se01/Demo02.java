package com.igeekhome.j2se01;

import java.util.Scanner;

public class Demo02 {

	/**
	 * 获取一个数，判断是否是素数
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数(>0):");
		int num=input.nextInt();
		//边界条件判定
		while(num<=0){
			System.out.println("请输入一个数(>0):");
			num=input.nextInt();
		}

		if(num==1){
			System.out.println("1不是素数");
			return;
		}
		
		
		//11   1    11
		//num   2   num-1
		boolean isMod=false;
		for(int i=2;i<=num-1;i++){
			if(num%i==0){
				isMod=true;
				break;
			}
		}
		
		//
		if(isMod){
			System.out.println(num+"不是一个素数");
		}else{
			System.out.println(num+"是一个素数");
		}
	}

}
