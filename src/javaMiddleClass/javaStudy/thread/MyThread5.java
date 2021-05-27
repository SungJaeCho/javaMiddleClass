package javaMiddleClass.javaStudy.thread;

public class MyThread5 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("MyThread5 실행");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
