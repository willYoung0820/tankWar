package com.igeekhome.tankwar.j2se11_27;

import java.util.Scanner;

public class Demo02 {
	
	/**
	 * ����һ����λ�����������ʮ���١�ǧλ������
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		//1234
		int one=num%10;
		int ten=num/10%10;	
		int hundred=num/100%10;
		int thousand=num/1000;
		
		System.out.println("��λ:"+one);
		System.out.println("ʮλ:"+ten);
		System.out.println("��λ:"+hundred);
		System.out.println("ǧλ:"+thousand);
	

	}

}
