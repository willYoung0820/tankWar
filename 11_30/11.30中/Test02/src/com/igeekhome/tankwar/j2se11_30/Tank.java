package com.igeekhome.tankwar.j2se11_30;

import java.awt.Color;
import java.awt.Graphics;

public class Tank extends Rectangle {
	//坦克的宽度
	public final static int TANK_WIDTH=40;
	//坦克的高度
	public final static int TANK_HEIGHT=20;
	//坦克运行的方向
	private Direction dir;
	//敌我识别的标记true->敌方   false->友方
	private boolean enemy;
	
	public Tank() {
		
	}
	
	public Tank(int x, int y, int width, int height,Direction dir,boolean enemy) {
		super(x,y,width,height);
		this.dir=dir;
		this.enemy=enemy;
	}
	
	public Tank(int x, int y,Direction dir,boolean enemy) {
		super(x,y,Tank.TANK_WIDTH,Tank.TANK_HEIGHT);
		this.dir=dir;
		this.enemy=enemy;
	}
	
	public Direction getDir() {
		return dir;
	}
	public void setDir(Direction dir) {
		this.dir = dir;
	}
	public boolean isEnemy() {
		return enemy;
	}
	public void setEnemy(boolean enemy) {
		this.enemy = enemy;
	}
	
	//坦克的绘制
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.drawRect(x, y, Tank.TANK_WIDTH, Tank.TANK_HEIGHT);
	}
	
}
