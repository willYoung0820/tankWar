package com.igeekhome.tankwar.j2se11_29.homework;

import java.util.Random;

/**
 * 
 * ����һ������ö����Direction
 * ����һ��̹����(x,y,width,height,����dir,���ұ��isEnemy)
 * �������10��̹��(���򡢵���ȫ���)    //̹�˼���
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
		Direction[] dirs=Direction.values();
		Random r=new Random();
		int i=r.nextInt(dirs.length);
		System.out.println(dirs[i]);
	}

}
