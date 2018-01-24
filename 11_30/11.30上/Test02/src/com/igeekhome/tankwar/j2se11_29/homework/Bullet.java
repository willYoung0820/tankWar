package com.igeekhome.tankwar.j2se11_29.homework;

public class Bullet extends Rectangle {
	//�ӵ��Ŀ��
	public final static int BULLET_WIDTH=15;
	//�ӵ��ĸ߶�
	public final static int BULLET_HEIGHT=15;
	//̹�����еķ���
	private Direction dir;
	//����ʶ��ı��true->�з�   false->�ѷ�
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
