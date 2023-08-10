package org.operadores_aritmeticos;

public abstract class Calculadora {
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	public static int div(int n1, int n2) {
		return n1 / n2;
	}
}