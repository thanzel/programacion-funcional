package exerc.lambdas.biFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /**
         * BiFunction:
         * Recibe dos valores y retorna un resultado
         */

        //el tercero es el que retorna, los 2 primeros son los parametros que entran
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> {
          return a + b;
        };

        int result = biFunction.apply(10, 20);
        System.out.println(result);

        //simplificando:
        BiFunction<Integer, Integer, Integer> biFunction2 = (a,b) ->  a + b;
        System.out.println(biFunction2.apply(5, 20));
    }
}
