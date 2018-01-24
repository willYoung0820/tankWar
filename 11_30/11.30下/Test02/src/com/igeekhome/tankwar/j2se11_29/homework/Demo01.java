package com.igeekhome.tankwar.j2se11_29.homework;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * ����һ������ö����Direction
 * ����һ��̹����(x,y,width,height,����dir,���ұ��isEnemy)
 * �������10��̹��(λ�á����򡢵���ȫ���)    //̹�˼���
 * ����һ���ӵ���(x,y,width,height,����dir,���ұ��isEnemy)
 * �������һ���ӵ�,�ж�����ӵ��Ƿ����̹�ˣ������и�̹�ˣ����������Ƴ���.
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
		//��Ϸ��Ļ��̹������
		ArrayList<Tank> tanks=new ArrayList<Tank>();
		
		Random r=new Random();
		Direction[] dirs=Direction.values();
		
		//�������10��̹��
		for(int i=0;i<10;i++){
			Tank t=new Tank();
			t.setX(r.nextInt(GameClient.SCREEN_WIDTH));
			t.setY(r.nextInt(GameClient.SCREEN_HEIGHT));
			t.setWidth(Tank.TANK_WIDTH);
			t.setHeight(Tank.TANK_HEIGHT);
			
			//����̹���������
			int j=r.nextInt(dirs.length);
			t.setDir(dirs[j]);
			//������ɵ��ұ��
			t.setEnemy(r.nextBoolean());

			
			tanks.add(t);
		}
		
		//�����ʼ̹������
		System.out.println("-----------��ǰ����̹��-------------");
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			System.out.println("̹��"+(i+1)+":"+t.x+","+t.y+","+t.isEnemy());
		}
		
		
		//�������һ���ӵ�
		Bullet b=new Bullet();
		b.setX(r.nextInt(GameClient.SCREEN_WIDTH));
		b.setY(r.nextInt(GameClient.SCREEN_HEIGHT));
		b.setWidth(Bullet.BULLET_WIDTH);
		b.setHeight(Bullet.BULLET_HEIGHT);
		
		//�����ӵ��������
		int j=r.nextInt(dirs.length);
		b.setDir(dirs[j]);
		//������ɵ��ұ��
		b.setEnemy(r.nextBoolean());
		System.out.println("bullet:"+b.x+","+b.y+","+b.isEnemy());
		
		//��ײ���
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			if(t.isEnemy()!=b.isEnemy()&&t.isIntersect(b)){
				System.out.println("̹��"+(i+1)+"������!");
				System.out.println("����pos��("+t.x+","+t.y+")");
				tanks.remove(t);
			}
		}
		
		//���ʣ�µ�̹������
		System.out.println("-----------��ǰ����̹��-------------");
		for(int i=0;i<tanks.size();i++){
			Tank t=tanks.get(i);
			System.out.println("̹��"+(i+1)+":"+t.x+","+t.y+","+t.isEnemy());
		}
		
	}

}
