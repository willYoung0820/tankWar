package com.igeekhome.tankwar.j2se11_28;

/**
 * ������
 * @author student
 *
 */
public class Rectangle {
	//���Ͻǵĺ�����
	private double x;
	//���Ͻǵ�������
	private double y;
	//���
	private double width;
	//�߶�
	private double height;
	
	//������:�����η�       ������ͬ��  
	//����ʵ����ʱ����
	//�޲����Ĺ�����
	public Rectangle(){
		this.x=1;
		this.y=2;
		this.width=3;
		this.height=4;
	}
	
	/**
	 * ����:��������ͬ���������Ĳ�����ͬ(������ͬ�����Ͳ�ͬ)
	 * 1��public void m1(){}
	 * 2��public void m2(){}
	 * 3��public void m1(int x){}
	 * 4��public void m1(int x,int y){}
	 * 5��public void m1(String x,int y){}
	 * 6��public int m1(String x,int y){}
	 * ��������:1��3��4��5
	 * ����������1��2
	 */
//	public void m1(){}
//	public void m2(){}
//	public void m1(int x){}
//	public void m1(int x,int y){}
//	public void m1(String x,int y){}
//	public int m1(String x,int y){}
	
	/**
	 * �������Ĺ�����
	 * @param x:���ϽǺ�����
	 * @param y�����Ͻ�������
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
	
	//������ε����
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
	 * �ж�2�������Ƿ��ཻ
	 * @param rect :Ŀ�����
	 * @return �Ƿ��ཻ
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
