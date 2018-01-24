package com.igeekhome.tankwar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * 游戏客户端
 * @author student
 *
 */
public class GameClient extends JFrame implements KeyListener{
	//游戏屏幕的宽
	public final static int SCREEN_WIDTH=1150;
	//游戏屏幕的高
	public final static int SCREEN_HEIGHT=650;
	//定义一个我方坦克
	Tank myTank;
	//定义一组敌方的坦克
	ArrayList<Tank> enemyTanks=new ArrayList<Tank>();
	
	//初始化容器
	public GameClient(){
		//游戏窗口的初始化
		this.setLocation(100, 50);
		this.setSize(GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		this.setTitle("坦克大战");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//引入键盘按键的监听器
		this.addKeyListener(this);
		
		//游戏对象初始化
		//初始化我方坦克
		myTank=new Tank(100,100,Direction.R,false);
		//初始化敌方坦克
		for(int i=0;i<5;i++){
			Tank t=new Tank((i+1)*GameClient.SCREEN_WIDTH/6,GameClient.SCREEN_HEIGHT-Tank.TANK_HEIGHT,Direction.U,true);
			enemyTanks.add(t);
		}
		
		
		//开启定时器
		Timer myTimer=new Timer(this);
		myTimer.start();
		//
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);

		//碰撞检测--敌方坦克之间
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
		//碰撞检测--我方坦克与敌方坦克
		for(int i=0;i<enemyTanks.size();i++){
			Tank t=enemyTanks.get(i);
			if(t.isIntersect(myTank)){
				myTank.restoreStatus();
				t.restoreStatus();
			}
		}
		
		//绘制我方坦克
		myTank.draw(g);
		//绘制敌方的坦克
		
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
