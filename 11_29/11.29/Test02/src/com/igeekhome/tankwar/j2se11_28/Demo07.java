package com.igeekhome.tankwar.j2se11_28;

/**
 * 
 * @author student
 *
 */
public class Demo07 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr={12,17,16,8,4,76,23,65,12,3};
		
		//sort		
		for(int turn=1;turn<=arr.length-1;turn++){
			for(int i=0;i<=arr.length-turn-1;i++){
				if(arr[i]>arr[i+1]){
					//交换2个的值
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
					
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}
