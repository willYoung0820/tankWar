package com.igeekhome.tankwar.j2se11_29;

/**
 * ��̬������������踸��
 * @author student
 *
 */
public class Demo02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬������������踸��
//		Vehicles v=new Car("��־308",4000);
		
		Vehicles[] myVehicles=new Vehicles[5];
		myVehicles[0]=new Car("��־308",4000);
		myVehicles[1]=new Bicycle("������",200,"����",2);
		myVehicles[2]=new Bicycle("�Ϸ��",150,"����",2);
		myVehicles[3]=new Car("Q7",5000);
		myVehicles[4]=new Car("QQ",3000);
		
		System.out.println(myVehicles[0] instanceof Car);
		System.out.println(myVehicles[0] instanceof Vehicles);
		System.out.println(myVehicles[0] instanceof Bicycle);
		
		for(int i=0;i<myVehicles.length;i++){
			if(myVehicles[i] instanceof Car){
				//
			}else if(myVehicles[i] instanceof Bicycle){
				//
			}
		}
		
	}

}
