package com.igeekhome.tankwar.j2se11_30;

/**
 * ¶¨Ê±Æ÷
 * @author student
 *
 */
public class Timer extends Thread {
	GameClient gc;
	
	public Timer(){
		
	}
	
	public Timer(GameClient gc){
		this.gc=gc;
	}
	
	@Override
	public void run() {
		while(true){
			gc.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
