package com.igeekhome.tankwar.j2se11_29;

import java.util.ArrayList;

/**
 *
 * @author student
 *
 */
public class Demo07 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {			
		ArrayList arrayList=new ArrayList(3);
		
		for(int i=0;i<100;i++){
			arrayList.add(i);
			System.out.println("arrayList.size:"+arrayList.size());
		}

	}

}
