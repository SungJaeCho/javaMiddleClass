package javaMiddleClass.javaStudy.thread;

/**
 * 쓰레드와 공유객체 그네(공유객체)-아이들(쓰레드)
 *
 */
public class MusicBoxExam {
	
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer kang = new MusicPlayer(1, box);
		MusicPlayer kim = new MusicPlayer(2, box);
		MusicPlayer cho = new MusicPlayer(3, box);
		
		kang.start();
		kim.start();
		cho.start();
	}

}
