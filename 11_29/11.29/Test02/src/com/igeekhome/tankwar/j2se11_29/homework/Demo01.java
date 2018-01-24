package com.igeekhome.tankwar.j2se11_29.homework;

import java.util.Random;

/**
 * 
 * 定义一个方向枚举类Direction
 * 定义一个坦克类(x,y,width,height,方向dir,敌我标记isEnemy)
 * 随机生成10辆坦克(方向、敌我全随机)    //坦克集合
 * 定义一个子弹类(x,y,width,height,方向dir,敌我标记isEnemy)
 * 随机生成一颗子弹,判定这颗子弹是否击中坦克，若击中该坦克，从容器中移除掉.
 * 
 * @author student
 *
 */
public class Demo01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Direction[] dirs=Direction.values();
		Random r=new Random();
		int i=r.nextInt(dirs.length);
		System.out.println(dirs[i]);
	}

}
