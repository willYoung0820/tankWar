package com.igeekhome.tankwar.j2se11_29;

/**
 * 交通工具类
 * @author student
 *
 */
public class Vehicles {
	//交通工具名
	protected String name;
	//载重量
	protected double weight;
	
	
	public Vehicles(){
		
	}
	
	public Vehicles(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * 行驶
	 */
	public void start(){
		System.out.println(name+"开始启动!");
	}
	
	/*
	 * 停止
	 */
	public void stop(){
		System.out.println(name+"停止!");
	}
	
}
