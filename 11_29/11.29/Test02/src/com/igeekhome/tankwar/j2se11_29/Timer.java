package com.igeekhome.tankwar.j2se11_29;

/**
 * ͨ���̳и���Thread��ʵ�ֶ�ʱ��
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
