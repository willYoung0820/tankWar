package com.igeekhome.tankwar.j2se11_30;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * 游戏客户端
 * @author student
 *
 */
public class GameClient extends JFrame {
	//游戏屏幕的宽
	public final static int SCREEN_WIDTH=1150;
	//游戏屏幕的高
	public final static int SCREEN_HEIGHT=650;
	//定义一个坦克
	Tank t=new Tank(100,100,Direction.D,true);
	
	//初始化容器
	public GameClient(){
		this.setLocation(100, 50);
		this.setSize(GameClient.SCREEN_WIDTH, GameClient.SCREEN_HEIGHT);
		this.setTitle("坦克大战");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		t.draw(g);

	}
	
	
}
