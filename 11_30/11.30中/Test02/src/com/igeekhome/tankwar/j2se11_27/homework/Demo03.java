package com.igeekhome.tankwar.j2se11_27.homework;

/**
 * 
 * @author student
 *
 */
public class Demo03 {

	/**
	 * 输出9*9乘法口诀表
	 * 1*1=1
	 * 1*2=2 2*2=4
	 * 1*3=3 2*3=6 3*3=9
	 * 1*4=4 2*4=8 3*4=12 4*4=16
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for(int row=1;row<=9;row++){
			for(int col=1;col<=row;col++){
				System.out.print(col+"*"+row+"="+row*col+"\t");
			}
			System.out.println("");
		}
		
	}

}
