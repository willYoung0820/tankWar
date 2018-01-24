package com.igeekhome.tankwar.j2se11_28.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author student
 *  
 */
public class Demo03 {

	/**
	 * 定义一组坦克，定义一组子弹，分别判定彼此是否相撞
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		
		Tank[] tanks=new Tank[10];
		Bullet[] bullets=new Bullet[10];
		
		//初始化坦克
		for(int i=0;i<tanks.length;i++){
			tanks[i]=new Tank();
			tanks[i].setX(r.nextInt(100));
			tanks[i].setY(r.nextInt(50));
			tanks[i].setWidth(20);
			tanks[i].setHeight(5);
		}
		
		//初始化子弹
		for(int i=0;i<bullets.length;i++){
			bullets[i]=new Bullet();
			bullets[i].setX(r.nextInt(100));
			bullets[i].setY(r.nextInt(50));
			bullets[i].setWidth(5);
			bullets[i].setHeight(3);
		}
		
		//输出坦克和子弹的状态
		System.out.println("--------------坦克状态-----------------");
		for(int i=0;i<tanks.length;i++){
			System.out.println("("+tanks[i].getX()+","+tanks[i].getY()+")");
		}
		
		System.out.println("--------------子弹状态-----------------");
		
		for(int i=0;i<bullets.length;i++){
			System.out.println("("+bullets[i].getX()+","+bullets[i].getY()+")");
		}
		
		System.out.println("------------碰撞状态-------------------");
		
		//碰撞检测
		for(int i=0;i<bullets.length;i++){
			for(int j=0;j<tanks.length;j++){
				if(bullets[i].isHit(tanks[j])){
					System.out.println("第"+(i+1)+"颗子弹击中了第"+(j+1)+"辆坦克!");
				}
			}
		}
		
	}

}
