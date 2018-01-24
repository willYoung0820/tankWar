package com.igeekhome.tankwar.j2se11_29.homework;

public class Test {

	public static void main(String[] args) {
		Tank t=new Tank(0,0,Direction.L,true);
		Bullet b=new Bullet(-16,-15,Direction.D,false);
		System.out.println(t.isIntersect(b));
	}

}
