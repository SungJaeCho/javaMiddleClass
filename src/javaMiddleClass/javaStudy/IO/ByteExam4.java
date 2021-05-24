package javaMiddleClass.javaStudy.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * try-with-resources 사용한 자원을 자동으로 종료시켜주는 기능 (close()를 안써도됨)
 *
 */
public class ByteExam4 {

	public static void main(String[] args) {
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
				) {
			int i = in.readInt();
			boolean b = in.readBoolean();
			Double d = in.readDouble();
			
			System.out.println("i:"+i);
			System.out.println("b:"+b);
			System.out.println("d:"+d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
