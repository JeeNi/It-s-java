package exception;

import java.io.*;

public class CheckedEx {
	public static void main(String[] arg) {
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
		// 파일을 제대로 읽으려면 FileReader 객체의 인자로 이름을 적는다
		
		String input = null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}