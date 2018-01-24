package com.igeekhome.tankwar.j2se11_28;

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
		Rectangle[] tanks=new Rectangle[10];
		
		for(int i=0;i<tanks.length;i++){
			tanks[i]=new Rectangle(i*50,50,30,20);
		}
	}

}
