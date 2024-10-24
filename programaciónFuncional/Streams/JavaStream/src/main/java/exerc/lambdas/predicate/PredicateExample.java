package exerc.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /**
         * Predicate:
         * Recibe un valor y devuelve un valor booleano (true or false)
         */

        Predicate<String> predicate = (str) -> {
            return str.length() > 5;
        };

        boolean result = predicate.test("Hola Mundo");
        System.out.println(result);

        //Simplificando:
        Predicate<String> predicate2 = (str) -> str.length() > 5;
        System.out.println(predicate2.test("Hola"));
    }
}
