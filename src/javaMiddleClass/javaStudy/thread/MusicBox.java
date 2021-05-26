package javaMiddleClass.javaStudy.thread;

public class MusicBox {
	
	//synchronized 선언시 먼저 들어온 메서드가 실행되어야 다음이 가능 꼭필요한부분에만 블록을 만들어서 사용
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("신나는 음악!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for(int i=0; i<10; i++) {
			// 반드시 싱크로를 맞춰야하는 부분만 
			synchronized (this) {
				System.out.println("시끄러운 음악!!!!");
			}
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
