package ua.lviv.lgs.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws MyException {
		System.out.println("������ ����� � 5 ����");
		Scanner scan = new Scanner(System.in);
		String s = scan.next().toUpperCase();
		
		System.out.println(s);
		if(s.length() != 5) {
			String message = "�� ����� ����� �� � 5 ����";
			throw new MyException(message); 
		}
		
		if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3))) {
			System.out.println("����� � ����������");
		}else {
			System.out.println("����� �� ��������");
		}
		
		System.out.println( s.replaceAll( "[A, E, I, O, U, Y, �, �, �, �, �, �, �, �, �, �]", "-" ) );
		
	
		
	}

}
