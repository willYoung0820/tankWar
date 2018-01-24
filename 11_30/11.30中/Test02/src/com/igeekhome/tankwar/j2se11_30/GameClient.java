package com.igeekhome.tankwar.j2se11_30;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * ��Ϸ�ͻ���
 * @author student
 *
 */
public class GameClient extends JFrame {
	//��Ϸ��Ļ�Ŀ�
	public final static int SCREEN_WIDTH=1150;
	//��Ϸ��Ļ�ĸ�
	public final static int SCREEN_HEIGHT=650;
	//����һ��̹��
	Tank t=new Tank(100,100,Direction.D,true);
	
	//��ʼ������
	public GameClient(){
		this.setLocation(100, 50);
		this.setSize(GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		this.setTitle("̹�˴�ս");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������ʱ��
		Timer myTimer=new Timer(this);
		myTimer.start();
		
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		
//		g.setColor(Color.BLACK);
//		g.drawRect(100, 100, 100, 100);
		t.draw(g);

	}
	
	
}
