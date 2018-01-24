package com.igeekhome.tankwar.j2se11_30;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tank extends Rectangle {
	//坦克的宽度
	public final static int TANK_WIDTH=40;
	//坦克的高度
	public final static int TANK_HEIGHT=20;
	//坦克的x轴速度
	public final static int TANK_X_SPEED=4;
	//坦克的x轴速度
	public final static int TANK_Y_SPEED=3;
	//坦克运行的方向
	private Direction dir;
	//记录坦克上一次操作的方向
	private Direction oldDir;
	//敌我识别的标记true->敌方   false->友方
	private boolean enemy;
	
	//静态块的代码预先加载
	static Image[] tankImages=null;
	static{
		tankImages=new Image[4];
		//加载坦克的图片
		try {
			tankImages[0]=ImageIO.read(new File("images/tankL.gif"));
			tankImages[1]=ImageIO.read(new File("images/tankR.gif"));
			tankImages[2]=ImageIO.read(new File("images/tankU.gif"));
			tankImages[3]=ImageIO.read(new File("images/tankD.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
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
		
		this.oldDir=dir;
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
		switch(oldDir){
			case L:
				g.drawImage(tankImages[0], x,y,TANK_WIDTH, TANK_HEIGHT, null);
				break;
			case R:
				g.drawImage(tankImages[1], x,y, TANK_WIDTH, TANK_HEIGHT, null);
				break;
			case U:
				g.drawImage(tankImages[2], x,y, TANK_WIDTH, TANK_HEIGHT, null);
				break;
			case D:
				g.drawImage(tankImages[3], x,y, TANK_WIDTH, TANK_HEIGHT, null);
				break;
		}
		
		//记录上一次的运动方向
		if(this.dir!=Direction.STOP){
			this.oldDir=dir;
		}
		
		move();
	}
	
	public void move(){
		switch(dir){
			case L:
				this.x-=Tank.TANK_X_SPEED;break;
			case R:
				this.x+=Tank.TANK_X_SPEED;break;
			case U:
				this.y-=Tank.TANK_Y_SPEED;break;
			case D:
				this.y+=Tank.TANK_Y_SPEED;break;
		}
	}
	
}
