package exerc.lambdas.binaryOperator;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        /**
         * BinaryOperator:
         * Recibe dos valores del mismo tipo y retorna un valor del mismo tipo
         */

        //ya que siempre será todo del mismo tipo, se ponde un solo tipo
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a + b;
        };

        int result = binaryOperator.apply(10, 20);
        System.out.println(result);
    }
}
