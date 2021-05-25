package javaMiddleClass.javaStudy.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * char단위 입출력(File)
 *
 */
public class CharIOExam2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/javaMiddleClass/javaStudy/IO/CharIOExam2.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));
			String line = null;
			
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//IO는 반드시 닫아줘야 실행이 완료된다.
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

}
