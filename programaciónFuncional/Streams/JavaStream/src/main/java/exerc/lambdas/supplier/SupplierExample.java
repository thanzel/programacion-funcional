package exerc.lambdas.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        /**
         * Supplier:
         * No recibe ningún valor, pero retorna un resultado
         * El Supplier<String> sería el parametro a retornar String
         * ojo no existe biSupplier
         */

        Supplier<String> supplier = () -> {
            return "Hola, soy un Supplier";
        };

        String result = supplier.get();

        System.out.println(result);

        //Simplificando:
        Supplier<String> supplier2 = () -> "Hola, soy un Supplier2";
        System.out.println(supplier2.get());
    }


}
