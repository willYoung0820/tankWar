package com.igeekhome.tankwar.j2se11_29.homework;

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
	
	public Tank(double x, double y, double width, double height,Direction dir,boolean enemy) {
		super(x,y,width,height);
		this.dir=dir;
		this.enemy=enemy;
	}
	
	public Tank(double x, double y,Direction dir,boolean enemy) {
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
	
	
}
