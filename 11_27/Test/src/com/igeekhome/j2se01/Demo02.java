package com.igeekhome.j2se01;

import java.util.Scanner;

public class Demo02 {

	/**
	 * ��ȡһ�������ж��Ƿ�������
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����(>0):");
		int num=input.nextInt();
		//�߽������ж�
		while(num<=0){
			System.out.println("������һ����(>0):");
			num=input.nextInt();
		}

		if(num==1){
			System.out.println("1��������");
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
			System.out.println(num+"����һ������");
		}else{
			System.out.println(num+"��һ������");
		}
	}

}
