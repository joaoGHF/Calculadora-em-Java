package org.operadores_aritmeticos;

public class App {
    public static void main(String[] args) throws Exception {
        int n1 = GetNum.getNum("first");
		int n2 = GetNum.getNum("second");
		
		System.out.println("Sum is: " + Calculadora.sum(n1, n2));
		System.out.println("Sub is: " + Calculadora.sub(n1, n2));
		System.out.println("Mul is: " + Calculadora.mul(n1, n2));
		System.out.println("Div is: " + Calculadora.div(n1, n2));
    }
}
