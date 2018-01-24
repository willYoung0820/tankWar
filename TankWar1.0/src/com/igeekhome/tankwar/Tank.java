package com.igeekhome.tankwar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Tank extends Rectangle {
	//̹�˵Ŀ��
	public final static int TANK_WIDTH=100;
	//̹�˵ĸ߶�
	public final static int TANK_HEIGHT=75;
	//̹�˵�x���ٶ�
	public final static int TANK_X_SPEED=4;
	//̹�˵�x���ٶ�
	public final static int TANK_Y_SPEED=3;
	//̹�����еķ���
	private Direction dir;
	//��¼̹����һ�β����ķ���
	private Direction oldDir;
	//����ʶ��ı��true->�з�   false->�ѷ�
	private boolean enemy;
	//�����
	Random random=new Random();
	//��¼̹����һ����״̬
	private int oldX;
	private int oldY;
	
	//��̬��Ĵ���Ԥ�ȼ���
	static Image[] tankImages=null;
	static{
		tankImages=new Image[4];
		//����̹�˵�ͼƬ
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
		
		//�洢��һ�εķ���
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

	//̹�˵Ļ���
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
		
		//��¼��һ�ε��˶�����
		if(this.dir!=Direction.STOP){
			this.oldDir=dir;
		}
		
		move();
	}
	
	//̹�˵��ƶ�
	public void move(){
		//�з�̹�˵�AI����
		if(enemy){
			//   1/10�����޸ķ���
			if(random.nextInt(50)==0){
				Direction[] dirs=Direction.values();
				int i=random.nextInt(dirs.length-1);
				this.dir=dirs[i];
			}
		}
		
		//������һ�ζ�����״̬
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
		
		//�ж��Ƿ�Խ��
		//ˮƽ����Խ��
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
		//��ֱ����Խ��
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
	
	//������һ�ζ�����״̬
	public void saveStatus(int x,int y){
		this.oldX=x;
		this.oldY=y;
	}
	
	//�ָ�̹����һ����״̬
	public void restoreStatus(){
		this.x=this.oldX;
		this.y=this.oldY;
	}
	
}
