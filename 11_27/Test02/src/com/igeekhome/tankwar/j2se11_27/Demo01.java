package com.igeekhome.tankwar.j2se11_27;

/**
 * 命名规范:首字母：_ 字母  $
 * 		 后面字母: 字母、数字、_
 * 		不能是关键字
 * 	规范:
 * 		命名有意义
 * 		骆驼命名法:userSex  customerHabit
 * @author student
 *
 */
public class Demo01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i=1;
		double d=1.23;
		char ch='A';
		//姓名
		String name="jikeying";
		boolean b=true;
		
		{
			int j=1;			
		}
		//无法访问
		//System.out.println("j="+j);
		
		System.out.println("------------");
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("ch="+ch);
		System.out.println("name="+name);
		System.out.println("b="+b);
		System.out.println("------------");
		
		//自动类型转化
		d=i;
		System.out.println("d="+d);
		//强制类型转化,可能丢失数据
		i=(int)d;
		System.out.println("i="+i);
		
		//byte->short->int->long->float->double
		float f=1.23f;
		double dd=f;
		//char<->int
		int ii='A';
		char cch=95;
		
		System.out.println("dd="+dd);
		System.out.println("ii="+ii);
		System.out.println("cch="+cch);
		
	}

}
