package org.calculadora;

import java.util.Scanner;

public abstract class GetNum {
    @SuppressWarnings("resources")
	public static long getNum(String name) {
		Scanner in = new Scanner(System.in);
		long n = 0L;
		while (true) {
			System.out.printf("Enter the '%s' number: ", name);
			String strN = in.next();
			
			try {
				n = Integer.parseInt(strN);
				break;
			} catch (Exception e) {
				System.err.println("Erro na entrada " + strN);
			}
		}
				
		return n;
	}
}