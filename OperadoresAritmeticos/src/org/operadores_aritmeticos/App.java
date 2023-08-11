package org.operadores_aritmeticos;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Select a option:\n" +
                "\t1 - sum\n" +
                "\t2 - sub\n" +
                "\t3 - mul\n" +
                "\t4 - div\n" +
                "\t5 - pow\n");

        long n1 = 0, n2 = 0;
        int op = (int) GetNum.getNum("option");

        switch (op) {
            case 1:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Sum is: " + Calculadora.sum(n1, n2));
                break;

            case 2:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Sub is: " + Calculadora.sub(n1, n2));
                break;

            case 3:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Mul is: " + Calculadora.mul(n1, n2));

                break;

            case 4:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Div is: " + Calculadora.div(n1, n2));
                break;

            case 5:
                n1 = GetNum.getNum("base");
                n2 = GetNum.getNum("expo");
                System.out.println("Pow is: " + Calculadora.pow(n1, n2));
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
