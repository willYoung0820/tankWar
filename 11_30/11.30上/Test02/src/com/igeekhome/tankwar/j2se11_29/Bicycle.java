package com.igeekhome.tankwar.j2se11_29;

public class Bicycle extends Vehicles {
	//动力
	private String engineer;
	//轮子
	private int wheel;
	
	public void push(){
		System.out.println(this.name+"在"+engineer+"下，开始push!");
	}
	
	public Bicycle(){
		
	}
	
	public Bicycle(String name,double weight,String engineer,int wheel){
		super(name,weight);
		this.engineer=engineer;
		this.wheel=wheel;
	}
	
	/**
	 * 方法重写
	 */
	public void start(){
		System.out.println("wheel:"+wheel);
		super.start();
	}
	
	
}
