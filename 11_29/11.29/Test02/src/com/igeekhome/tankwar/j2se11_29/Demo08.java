package com.igeekhome.tankwar.j2se11_29;

import java.util.ArrayList;
import java.util.Random;

/**
 * �򼯺���������20�����֣�����5�����е�λ�ã����޸���Ϊ500
 * @author student
 *
 */
public class Demo08 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {			
		ArrayList arrayList=new ArrayList();
		
		Random r=new Random();
		for(int i=0;i<20;i++){
			arrayList.add(r.nextInt(10));
		}		
		System.out.println(arrayList);
		
		for(int i=0;i<arrayList.size();i++){
			int value=(int)arrayList.get(i);
			if(value==5){
				arrayList.set(i, 500);
			}
		}
		
		System.out.println(arrayList);
	}

}
