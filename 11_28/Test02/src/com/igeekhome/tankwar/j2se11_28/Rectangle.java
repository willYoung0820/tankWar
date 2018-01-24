package com.igeekhome.tankwar.j2se11_28;

/**
 * 矩形类
 * @author student
 *
 */
public class Rectangle {
	//左上角的横坐标
	private double x;
	//左上角的纵坐标
	private double y;
	//宽度
	private double width;
	//高度
	private double height;
	
	//构造器:无修饰符       与类名同名  
	//当类实例化时调用
	//无参数的构造器
	public Rectangle(){
		this.x=1;
		this.y=2;
		this.width=3;
		this.height=4;
	}
	
	/**
	 * 重载:方法名相同，但方法的参数不同(个数不同、类型不同)
	 * 1、public void m1(){}
	 * 2、public void m2(){}
	 * 3、public void m1(int x){}
	 * 4、public void m1(int x,int y){}
	 * 5、public void m1(String x,int y){}
	 * 6、public int m1(String x,int y){}
	 * 构成重载:1、3、4、5
	 * 不构成重载1、2
	 */
//	public void m1(){}
//	public void m2(){}
//	public void m1(int x){}
//	public void m1(int x,int y){}
//	public void m1(String x,int y){}
//	public int m1(String x,int y){}
	
	/**
	 * 带参数的构造器
	 * @param x:左上角横坐标
	 * @param y：左上角纵坐标
	 */
	public Rectangle(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public Rectangle(double x,double y,double width,double height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	//计算矩形的面积
	public double getArea(){
		return this.width*this.height;
	}
	
	public void setX(double x){
		this.x=x;
	}
	
	public double getX(){
		return x;
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
	 * 判定2个矩形是否相交
	 * @param rect :目标矩形
	 * @return 是否相交
	 */
	public boolean isIntersect(Rectangle rect){
		if(this.x+this.width<rect.getX()||this.x>rect.getX()+rect.getWidth()){
			return false;
		}
		if(this.y+this.height<rect.getY()||this.getY()>rect.getY()+rect.getHeight()){
			return false;
		}
		
		return true;
	}
}
