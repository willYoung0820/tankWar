package com.igeekhome.tankwar.j2se11_29;

/**
 * static ����̬���η�
 * 		��̬��Ա�����࣬�����������ʵ��
 * 		��̬��Ա����ͨ���������ʣ�Ҳ����ͨ�����ʵ��������
 * @author student
 *
 */
public class Demo05 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {			
		System.out.println(GameScreen.V);
		
		GameScreen gs1=new GameScreen();
		gs1.V++;
		System.out.println(gs1.V);
		GameScreen gs2=new GameScreen();
		System.out.println(gs2.V);
		
	}

}
