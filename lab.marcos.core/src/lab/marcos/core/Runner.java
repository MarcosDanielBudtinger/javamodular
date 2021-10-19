package lab.marcos.core;

import lab.marcos.utils.operacao.Calculadora;

public class Runner {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //SUM
        System.out.println(calculadora.sum(10, 5));

        //SUB
        System.out.println(calculadora.sub(10, 5));

        //MULT
        System.out.println(calculadora.mult(10, 5));

        //DIV
        System.out.println(calculadora.div(10, 5));
    }
}
