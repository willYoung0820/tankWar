package com.igeekhome.tankwar.j2se11_29.homework;

public class Tank extends Rectangle {
	//̹�˵Ŀ��
	public final static int TANK_WIDTH=40;
	//̹�˵ĸ߶�
	public final static int TANK_HEIGHT=20;
	//̹�����еķ���
	private Direction dir;
	//����ʶ��ı��true->�з�   false->�ѷ�
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
