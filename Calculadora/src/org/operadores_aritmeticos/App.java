package org.operadores_aritmeticos;

public class App {
    public static void main(String[] args) throws Exception {
        boolean canRun = true;
        while (canRun) {
            canRun = run();
        }
    }

    private static boolean run() {
        System.out.println("\nSelect a option:\n" +
                "\t1 - sum\n" +
                "\t2 - sub\n" +
                "\t3 - mul\n" +
                "\t4 - div\n" +
                "\t5 - pow\n" +
                "\tAnother to close\n");

        long n1 = 0, n2 = 0;
        int op = (int) GetNum.getNum("option");

        switch (op) {
            case 1:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Sum is: " + Calculadora.sum(n1, n2));
                return true;
            case 2:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Sub is: " + Calculadora.sub(n1, n2));
                return true;

            case 3:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Mul is: " + Calculadora.mul(n1, n2));
                return true;

            case 4:
                n1 = GetNum.getNum("first");
                n2 = GetNum.getNum("second");

                System.out.println("Div is: " + Calculadora.div(n1, n2));
                return true;

            case 5:
                n1 = GetNum.getNum("base");
                n2 = GetNum.getNum("expo");

                System.out.println("Pow is: " + Calculadora.pow(n1, n2));
                return true;

            default:
                System.out.println("Closing...");
                return false;
        }
    }
}
