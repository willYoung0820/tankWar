package com.igeekhome.tankwar.j2se11_28;

/**
 * 
 * @author student
 *
 */
public class Demo05 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr=new int[10];
		//给数组赋值
		for(int i=0;i<10;i++){
			arr[i]=(int)(Math.random()*100);
		}
		
		//max:
		//min:
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
		//输出数组的数据
		for(int i=0;i<10;i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
		
	}

}
