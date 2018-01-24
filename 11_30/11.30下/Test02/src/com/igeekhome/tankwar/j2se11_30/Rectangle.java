package com.igeekhome.tankwar.j2se11_30;

import com.igeekhome.tankwar.j2se11_28.homework.Tank;

/**
 * 矩形
 * @author student
 *
 */
public class Rectangle {
	//左上角的横坐标
	protected int x;
	//左上角的纵坐标
	protected int y;
	//宽度
	protected int width;
	//高度
	protected int height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * 检测2个矩形是否相交
	 * @param r
	 * @return 
	 */
	public boolean isIntersect(Rectangle r){
		if(this.x+this.width<r.getX()||this.x>r.getX()+r.getWidth()){
			return false;
		}
		if(this.y+this.height<r.getY()||this.getY()>r.getY()+r.getHeight()){
			return false;
		}
		
		return true;
	}
	
}
