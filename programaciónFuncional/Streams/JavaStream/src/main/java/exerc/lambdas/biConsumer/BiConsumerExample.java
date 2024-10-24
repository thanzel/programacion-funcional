package exerc.lambdas.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /**
         *         BiConsumer:
         *         Recibe dos valores y no retorna nada
         */

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println(a + " " + b);
        };

        biConsumer.accept("Hola", "Mundo");

        //simplificando: aqui no se puede hacer la técnica del os dos puntos pq recibimos 2 parámetros aunque no se usen dentro del cuerpo,
        // la técnica de los dos puntos solo funciona cuando se tiene un solo parámetro.

        BiConsumer<String, String> biConsumer2 = (a, b) -> System.out.println(a + " " + b);
        biConsumer2.accept("Chao", "Mundo");

    }
}
