package com.igeekhome.tankwar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Tank extends Rectangle {
	//坦克的宽度
	public final static int TANK_WIDTH=100;
	//坦克的高度
	public final static int TANK_HEIGHT=75;
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
	//随机数
	Random random=new Random();
	//记录坦克上一步的状态
	private int oldX;
	private int oldY;
	
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

	
	public Tank(int x, int y,Direction dir,boolean enemy) {
		super(x,y,Tank.TANK_WIDTH,Tank.TANK_HEIGHT);
		this.dir=dir;
		this.enemy=enemy;
		
		//存储上一次的方向
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
	
	//坦克的移动
	public void move(){
		//敌方坦克的AI动作
		if(enemy){
			//   1/10概率修改方向
			if(random.nextInt(50)==0){
				Direction[] dirs=Direction.values();
				int i=random.nextInt(dirs.length-1);
				this.dir=dirs[i];
			}
		}
		
		//保存上一次动作的状态
		saveStatus(x,y);
		
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
		
		//判定是否越界
		//水平方向越界
		if(x<0){
			restoreStatus();
			if(enemy){
				dir=Direction.R;
			}
		}else if(x+Tank.TANK_WIDTH>GameClient.SCREEN_WIDTH){
			restoreStatus();
			if(enemy){
				dir=Direction.L;
			}
		}
		//垂直方向越界
		if(y<20){
			restoreStatus();
			if(enemy){
				dir=Direction.D;
			}
		}else if(y+Tank.TANK_HEIGHT>GameClient.SCREEN_HEIGHT){
			restoreStatus();
			if(enemy){
				dir=Direction.U;
			}
		}
	}
	
	//保存上一次动作的状态
	public void saveStatus(int x,int y){
		this.oldX=x;
		this.oldY=y;
	}
	
	//恢复坦克上一步的状态
	public void restoreStatus(){
		this.x=this.oldX;
		this.y=this.oldY;
	}
	
}
