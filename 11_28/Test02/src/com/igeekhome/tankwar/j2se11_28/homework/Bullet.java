package com.igeekhome.tankwar.j2se11_28.homework;

public class Bullet {
	private double x;
	private double y;
	private double width;
	private double height;
	
	public Bullet(){
		
	}
	
	public Bullet(double x, double y, double width, double height) {
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
	
	public boolean isHit(Tank t){
		if(this.x+this.width<t.getX()||this.x>t.getX()+t.getWidth()){
			return false;
		}
		if(this.y+this.height<t.getY()||this.getY()>t.getY()+t.getHeight()){
			return false;
		}
		
		return true;
	}
	
}
