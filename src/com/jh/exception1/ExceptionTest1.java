package com.jh.exception1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int age =0;
		
			try {
			age = sc.nextInt();
			//throw new InputMismatchException();
			//ArrayList<String> ar = new ArrayList<String>();
			age = 5/age;
			//throw new ArithmeticException();
			
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("숫자만 입력하세요");
			}
			
			//catch(ArithmeticException a) {
			//	System.out.println("0으로 나눌 수 없다.");
			//}
	
		
			// 예외처리시 실행할 코드
	
		System.out.println("Age: "+age);
		
	}

}
