package com.igeekhome.tankwar.j2se11_29.homework;

import com.igeekhome.tankwar.j2se11_28.homework.Tank;

/**
 * 矩形
 * @author student
 *
 */
public class Rectangle {
	//左上角的横坐标
	protected double x;
	//左上角的纵坐标
	protected double y;
	//宽度
	protected double width;
	//高度
	protected double height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
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
