package com.igeekhome.tankwar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;

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
	Tank myTank;
	//����һ��з���̹��
	ArrayList<Tank> enemyTanks=new ArrayList<Tank>();
	
	//��ʼ������
	public GameClient(){
		//��Ϸ���ڵĳ�ʼ��
		this.setLocation(100, 50);
		this.setSize(GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		this.setTitle("̹�˴�ս");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������̰����ļ�����
		this.addKeyListener(this);
		
		//��Ϸ�����ʼ��
		//��ʼ���ҷ�̹��
		myTank=new Tank(100,100,Direction.R,false);
		//��ʼ���з�̹��
		for(int i=0;i<5;i++){
			Tank t=new Tank((i+1)*GameClient.SCREEN_WIDTH/6,GameClient.SCREEN_HEIGHT-Tank.TANK_HEIGHT,Direction.U,true);
			enemyTanks.add(t);
		}
		
		
		//������ʱ��
		Timer myTimer=new Timer(this);
		myTimer.start();
		//
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);

		//��ײ���--�з�̹��֮��
		for(int i=0;i<enemyTanks.size()-1;i++){
			for(int j=i+1;j<enemyTanks.size();j++){
				Tank tanki=enemyTanks.get(i);
				Tank tankj=enemyTanks.get(j);
				if(tanki.isIntersect(tankj)){
					tanki.restoreStatus();
					tankj.restoreStatus();
				}
			}
		}
		//��ײ���--�ҷ�̹����з�̹��
		for(int i=0;i<enemyTanks.size();i++){
			Tank t=enemyTanks.get(i);
			if(t.isIntersect(myTank)){
				myTank.restoreStatus();
				t.restoreStatus();
			}
		}
		
		//�����ҷ�̹��
		myTank.draw(g);
		//���Ƶз���̹��
		
		for(int i=0;i<enemyTanks.size();i++){
			Tank eTank=enemyTanks.get(i);
			eTank.draw(g);
		}
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
