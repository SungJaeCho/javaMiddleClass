package javaMiddleClass.javaStudy.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 파일을 512byte씩 읽어서 파일을 작성
 *
 */
public class ByteExam2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null; // 파일읽음
		FileOutputStream fos = null; //파일쓰기
		
		try {
			
			fis = new FileInputStream("src/javaMiddleClass/javaStudy/IO/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];  //
			
			while((readCount = fis.read(buffer)) != -1) { //파일읽는게 끝날때는 -1를 리턴함
				fos.write(buffer, 0, readCount); // 0부터 buffer만큼 읽어서 readCount만큼 써달라
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
	
}
