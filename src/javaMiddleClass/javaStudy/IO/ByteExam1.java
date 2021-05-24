package javaMiddleClass.javaStudy.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 파일을 1byte씩 읽어서 파일을 작성
 * 기본적으로 512byte를 읽으나 아래와같이 1byte씩 읽으라고할경우 512를 읽고 1byte읽고 511byte를 버리는 작업을 하게 되므로 속도가 느림
 * 파일을 읽을때는 되도록 512의 배수로 버퍼를 잡는것이 성능상으로 좋음
 *
 */
public class ByteExam1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null; // 파일읽음
		FileOutputStream fos = null; //파일쓰기
		
		try {
			
			fis = new FileInputStream("src/javaMiddleClass/javaStudy/IO/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) { //파일읽는게 끝날때는 -1를 리턴함
				fos.write(readData);
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
