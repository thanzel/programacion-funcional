package exerc.lambdas.consumer;

import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConsumerExample {
    public static void main(String[] args) {

        /**
         * Lambdas: funciones de flechas
         */

        /**
         * Consumer:
         * Recibe un valor y no retorna nada
         */

        //primer ejemplo
        /*Consumer<String> consumer = (param) -> {
            System.out.println(param);
        };*/

        //Cuando un lambda es de una sola línea le puedo quitar las llaves
        //Consumer<String> consumer = (param) -> System.out.println(param);

        //incluso puede reducirse aún más sin el return, asi:
        Consumer<String> consumer = System.out::println;

        consumer.accept("Yenny");

    }
}