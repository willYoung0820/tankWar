package com.igeekhome.tankwar.j2se11_29;

import java.util.ArrayList;

/**
 *
 * @author student
 *
 */
public class Demo06 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {			
		ArrayList arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add("abc");
		arrayList.add(1.456);
		arrayList.add(new Dog());
		
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
	}

}
