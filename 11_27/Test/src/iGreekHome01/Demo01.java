package iGreekHome01;

import java.util.Scanner;

public class Demo01
{
	public static void main(String[] args)
	{
		int i=1;
		char ch='a';
		boolean flag=true;
		String name= "name";
		double pi=3.14;
		System.out.println("i="+i);
		System.out.println("ch="+ch);
		System.out.println("flag="+flag);
		System.out.println("name="+name);
		System.out.println("pi="+pi);
		/**
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正数：");
		int No= sc.nextInt();
		//判断No的取值范围
		if(No<=0){
			System.out.println("请输入一个正数");
			return;
		}
		else if(No==1){
			System.out.println("1不是素数");
			return;
		}
		//遍历No能否被小于No的数整除，判断是否为素数
		for(int i=2;i<No;i++){
			if(No%i==0){
			flag=true;
			}
		}
		if(flag){
			System.out.println(No+"不是素数");
		}
		else{
			System.out.println(No+"是素数");
		}
		*/
	}
}	
