package com.igeekhome.tankwar.j2se11_29;

/**
 * ��ͨ������
 * @author student
 *
 */
public class Vehicles {
	//��ͨ������
	protected String name;
	//������
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
	 * ��ʻ
	 */
	public void start(){
		System.out.println(name+"��ʼ����!");
	}
	
	/*
	 * ֹͣ
	 */
	public void stop(){
		System.out.println(name+"ֹͣ!");
	}
	
}
