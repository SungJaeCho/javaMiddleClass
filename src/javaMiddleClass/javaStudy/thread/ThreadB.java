package javaMiddleClass.javaStudy.thread;

public class ThreadB extends Thread {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			notify(); //이걸 해야 다음 쓰레드가 활동함
		}
	}
}
