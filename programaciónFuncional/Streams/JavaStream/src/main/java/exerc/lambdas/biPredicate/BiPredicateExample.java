package exerc.lambdas.biPredicate;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        /**
         * Bi Predicate:
         * Recibe dos valores y devuelve un booleando (true o false)
         */

        //es redundante poner u ntercer parametro como boolean, pq siempre devolvera eso, por ello no se pone
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return  a > b;
        };

        boolean result = biPredicate.test(10, 15);
        System.out.println(result);
    }
}
