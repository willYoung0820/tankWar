package com.igeekhome.tankwar.j2se11_30;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * ��Ϸ�ͻ���
 * @author student
 *
 */
public class GameClient extends JFrame implements KeyListener{
	//��Ϸ��Ļ�Ŀ�
	public final static int SCREEN_WIDTH=1150;
	//��Ϸ��Ļ�ĸ�
	public final static int SCREEN_HEIGHT=650;
	//����һ���ҷ�̹��
	Tank myTank=new Tank(100,100,Direction.R,true);
	
	//��ʼ������
	public GameClient(){
		this.setLocation(100, 50);
		this.setSize(GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		this.setTitle("̹�˴�ս");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������̰����ļ�����
		this.addKeyListener(this);
		
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
		
		//�����ҷ�̹��
		myTank.draw(g);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:
				myTank.setDir(Direction.L);break;
			case KeyEvent.VK_RIGHT:
				myTank.setDir(Direction.R);break;
			case KeyEvent.VK_UP:
				myTank.setDir(Direction.U);break;
			case KeyEvent.VK_DOWN:
				myTank.setDir(Direction.D);break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		myTank.setDir(Direction.STOP);		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
