package com.igeekhome.tankwar.j2se11_29;

public class Bicycle extends Vehicles {
	//����
	private String engineer;
	//����
	private int wheel;
	
	public void push(){
		System.out.println(this.name+"��"+engineer+"�£���ʼpush!");
	}
	
	public Bicycle(){
		
	}
	
	public Bicycle(String name,double weight,String engineer,int wheel){
		super(name,weight);
		this.engineer=engineer;
		this.wheel=wheel;
	}
	
	/**
	 * ������д
	 */
	public void start(){
		System.out.println("wheel:"+wheel);
		super.start();
	}
	
	
}
