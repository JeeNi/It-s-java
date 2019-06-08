package io;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {					
			System.out.println(sc.nextInt()*1000);
		}
		sc. close();
		
		// 아래 예제는 한 번 실행하고 난 뒤 결과를 출력하면 프로그램이 끝나지만 
		// 위 예제는 프로그램을 다시 실행할 필요 없이 어플리케이션과 계속 상호작용함
		
		/*
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();						// nextInt()라는 메소드는 이 구문이 실행되면
		System.out.println(i*1000);					// 프로그램은 여기서 실행을 멈추고 기다리는 상태
		sc. close();
		*/
	}

}
