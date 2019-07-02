package exception;

import java.io.*;

class B {
	void run() throws IOException, FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		
		/*
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		*/
		
		/*
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		*/
		
		/*
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		*/
		
		bReader = new BufferedReader(new FileReader("out.txt"));
		/*
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		*/
		input = bReader.readLine();
		System.out.println(input);
	} 
}

class C {
	void run() throws IOException, FileNotFoundException {
		B b = new B();
		/*
		try {
			b.run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			try {
				b.run();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		b.run();
	}
}
public class ThrowEx {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
	    } catch (FileNotFoundException e) {
	    	System.out.println("out.txt 파일이 필요합니다.");	
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
}
