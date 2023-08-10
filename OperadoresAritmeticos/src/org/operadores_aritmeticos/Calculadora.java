package org.operadores_aritmeticos;

public abstract class Calculadora {
	public static long sum(long n1, long n2) {
		return n1 + n2;
	}
	
	public static long sub(long n1, long n2) {
		return n1 - n2;
	}
	
	public static long mul(long n1, long n2) {
		return n1 * n2;
	}
	
	public static long div(long n1, long n2) {
		return n1 / n2;
	}

    public static long pow(long base, long exp) {
        long result = 1;
        for (long i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }
}