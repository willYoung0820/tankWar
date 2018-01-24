package com.igeekhome.tankwar.j2se11_29.homework;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * 定义一个方向枚举类Direction
 * 定义一个坦克类(x,y,width,height,方向dir,敌我标记isEnemy)
 * 随机生成10辆坦克(位置、方向、敌我全随机)    //坦克集合
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
		//游戏屏幕中坦克容器
		ArrayList<Tank> tanks=new ArrayList<Tank>();
		
		Random r=new Random();
		Direction[] dirs=Direction.values();
		
		//随机生成10辆坦克
		for(int i=0;i<10;i++){
			Tank t=new Tank();
			t.setX(r.nextInt(GameClient.SCREEN_WIDTH));
			t.setY(r.nextInt(GameClient.SCREEN_HEIGHT));
			t.setWidth(Tank.TANK_WIDTH);
			t.setHeight(Tank.TANK_HEIGHT);
			
			//生成坦克随机方向
			int j=r.nextInt(dirs.length);
			t.setDir(dirs[j]);
			//随机生成敌我标记
			t.setEnemy(r.nextBoolean());

			
			tanks.add(t);
		}
		
		//输出初始坦克坐标
		System.out.println("-----------当前存活的坦克-------------");
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			System.out.println("坦克"+(i+1)+":"+t.x+","+t.y+","+t.isEnemy());
		}
		
		
		//随机生成一颗子弹
		Bullet b=new Bullet();
		b.setX(r.nextInt(GameClient.SCREEN_WIDTH));
		b.setY(r.nextInt(GameClient.SCREEN_HEIGHT));
		b.setWidth(Bullet.BULLET_WIDTH);
		b.setHeight(Bullet.BULLET_HEIGHT);
		
		//生成子弹随机方向
		int j=r.nextInt(dirs.length);
		b.setDir(dirs[j]);
		//随机生成敌我标记
		b.setEnemy(r.nextBoolean());
		System.out.println("bullet:"+b.x+","+b.y+","+b.isEnemy());
		
		//碰撞检测
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			if(t.isEnemy()!=b.isEnemy()&&t.isIntersect(b)){
				System.out.println("坦克"+(i+1)+"被击毁!");
				System.out.println("击毁pos：("+t.x+","+t.y+")");
				tanks.remove(t);
			}
		}
		
		//输出剩下的坦克坐标
		System.out.println("-----------当前存活的坦克-------------");
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			System.out.println("坦克"+(i+1)+":"+t.x+","+t.y+","+t.isEnemy());
		}
		
	}

}
