package javaMiddleClass.javaStudy.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * try-with-resources 사용한 자원을 자동으로 종료시켜주는 기능 (close()를 안써도됨)
 *
 */
public class ByteExam3 {

	public static void main(String[] args) {
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			//다양한 타입의 출력
			out.writeInt(100); //정수 4byte
			out.writeBoolean(true); // 1byte
			out.writeDouble(50.5); // 8byte
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
