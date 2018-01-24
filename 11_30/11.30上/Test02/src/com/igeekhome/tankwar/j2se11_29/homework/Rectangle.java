package com.igeekhome.tankwar.j2se11_29.homework;

import com.igeekhome.tankwar.j2se11_28.homework.Tank;

/**
 * ����
 * @author student
 *
 */
public class Rectangle {
	//���Ͻǵĺ�����
	protected double x;
	//���Ͻǵ�������
	protected double y;
	//���
	protected double width;
	//�߶�
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
	 * ���2�������Ƿ��ཻ
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
