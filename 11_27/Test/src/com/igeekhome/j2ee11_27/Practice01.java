package com.iGeekHome.j2ee11_27;

import java.util.Scanner;

public class Practice01
{

	public static void main(String[] args)
	{
		System.out.println("��������������");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("�������"+((num1>num2?num1:num2)<num3?num3:(num1>num2?num1:num2)));
	}

}
