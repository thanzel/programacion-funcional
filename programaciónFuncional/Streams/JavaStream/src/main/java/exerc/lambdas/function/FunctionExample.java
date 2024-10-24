package exerc.lambdas.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        /**
         * Function:
         * Recibe un valor y retorna un resultado
         */

        //recibe el integer y retorna el string en este ejemplo
        Function<Integer, String> function =  (num) -> {
            return "El número es: " + num;
        };

        String result = function.apply(5);
        System.out.println(result);
    }

}
