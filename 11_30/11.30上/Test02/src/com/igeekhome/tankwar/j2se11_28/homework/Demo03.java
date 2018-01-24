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
	 * ����һ��̹�ˣ�����һ���ӵ����ֱ��ж��˴��Ƿ���ײ
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		
		Tank[] tanks=new Tank[10];
		Bullet[] bullets=new Bullet[10];
		
		//��ʼ��̹��
		for(int i=0;i<tanks.length;i++){
			tanks[i]=new Tank();
			tanks[i].setX(r.nextInt(100));
			tanks[i].setY(r.nextInt(50));
			tanks[i].setWidth(20);
			tanks[i].setHeight(5);
		}
		
		//��ʼ���ӵ�
		for(int i=0;i<bullets.length;i++){
			bullets[i]=new Bullet();
			bullets[i].setX(r.nextInt(100));
			bullets[i].setY(r.nextInt(50));
			bullets[i].setWidth(5);
			bullets[i].setHeight(3);
		}
		
		//���̹�˺��ӵ���״̬
		System.out.println("--------------̹��״̬-----------------");
		for(int i=0;i<tanks.length;i++){
			System.out.println("("+tanks[i].getX()+","+tanks[i].getY()+")");
		}
		
		System.out.println("--------------�ӵ�״̬-----------------");
		
		for(int i=0;i<bullets.length;i++){
			System.out.println("("+bullets[i].getX()+","+bullets[i].getY()+")");
		}
		
		System.out.println("------------��ײ״̬-------------------");
		
		//��ײ���
		for(int i=0;i<bullets.length;i++){
			for(int j=0;j<tanks.length;j++){
				if(bullets[i].isHit(tanks[j])){
					System.out.println("��"+(i+1)+"���ӵ������˵�"+(j+1)+"��̹��!");
				}
			}
		}
		
	}

}
