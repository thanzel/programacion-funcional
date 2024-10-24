package exerc.lambdas.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /**
         * UnaryOperator:
         * Recibe un valor, lo procesa y devuelve un resultado del mismo tipo
         */

        //cuando se tiene un solo atributo se puede quitar los parentesis
        UnaryOperator<Integer> unaryOperator = (number) -> {
          return number * number;
        };

        int result = unaryOperator.apply(5);
        System.out.println(result);
    }
}
