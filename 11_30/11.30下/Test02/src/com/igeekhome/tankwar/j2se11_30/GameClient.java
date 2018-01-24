package com.igeekhome.tankwar.j2se11_30;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;

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
	Tank myTank=new Tank(100,100,Direction.R,true);
	
	//初始化容器
	public GameClient(){
		this.setLocation(100, 50);
		this.setSize(GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		this.setTitle("坦克大战");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//引入键盘按键的监听器
		this.addKeyListener(this);
		
		//开启定时器
		Timer myTimer=new Timer(this);
		myTimer.start();
		
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		
//		g.setColor(Color.BLACK);
//		g.drawRect(100, 100, 100, 100);
		
		//绘制我方坦克
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
