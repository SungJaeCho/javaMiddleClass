package javaMiddleClass.javaStudy;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("it's me");
		sb3.append(" plus");
		
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
	
	}

}
