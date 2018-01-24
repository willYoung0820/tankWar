package com.igeekhome.tankwar.j2se11_29;

/**
 * 通过继承父类Thread来实现定时器
 * @author student
 *
 */
public class Timer extends Thread {

	@Override
	public void run() {
		while(true){
			System.out.println("Timer Start()");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
	}
	
}
