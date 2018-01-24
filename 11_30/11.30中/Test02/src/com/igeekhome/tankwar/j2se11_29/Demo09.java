package com.igeekhome.tankwar.j2se11_29;

import java.util.ArrayList;
import java.util.Random;

/**
 * 泛型集合：集合的改良版本,限制在集合中装载元素的类型，提高数据读写的效率
 * 
 * 向集合中随机添加20个数字，检索5在其中的位置，并修改他为500
 * @author student
 *
 */
public class Demo09 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {			
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		Random r=new Random();
		for(int i=0;i<20;i++){
			arrayList.add(r.nextInt(10));
		}		
		System.out.println(arrayList);
		
		for(int i=0;i<arrayList.size();i++){
			int value=arrayList.get(i);
			if(value==5){
				arrayList.set(i, 500);
			}
		}
		
		System.out.println(arrayList);
	}

}
