package com.iGeekHome.j2ee11_27;

import java.util.Scanner;

public class Practice02
{
	static int max(int m,int n){
		int temp=0;
		if(m<n){
			temp=m;m=n;n=temp;
		}
		while(m%n!=0){
			int flag=m%n;
			m=n;
			n=flag;
		}
		return n;
	}	
	static int min(int i,int j){
		return i*j/max(i,j);
	}

	public static void main(String[] args)
	{
		/**
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数：");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for(int i=(num2>num1?num2:num1);i<num1*num2;i++){
			if(i%num1==0&&i%num2==0){
				System.out.println(num1+"和"+num2+"的最大公约数是："+i);
				break;
			}
		}
		for(int j=(num2<num1?num2:num1);j>=1;j--){
			if(num1%j==0&&num2%j==0){
				System.out.println(num1+"和"+num2+"的最小公倍数是："+j);
				break;
			}
		}
		*/
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("最大公约数是："+max(num1,num2));
		System.out.println("最小公倍数是："+min(num1,num2));
		}
	}


