package com.igeekhome.tankwar.j2se11_29.homework;

public class Bullet extends Rectangle {
	//子弹的宽度
	public final static int BULLET_WIDTH=15;
	//子弹的高度
	public final static int BULLET_HEIGHT=15;
	//坦克运行的方向
	private Direction dir;
	//敌我识别的标记true->敌方   false->友方
	private boolean enemy;
	
	public Bullet() {
		
	}
	
	public Bullet(double x, double y, double width, double height,Direction dir,boolean enemy) {
		super(x,y,width,height);
		this.dir=dir;
		this.enemy=enemy;
	}
	
	public Bullet(double x, double y, Direction dir,boolean enemy) {
		super(x,y,Bullet.BULLET_WIDTH,Bullet.BULLET_HEIGHT);
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
