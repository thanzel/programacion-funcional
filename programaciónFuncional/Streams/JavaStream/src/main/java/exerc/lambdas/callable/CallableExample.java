package exerc.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /**
         * Callable:
         * No recibe valores, si recibe un resultado y  puede lanzar una excepcion lo que hace la diferencia con el function
         * se usa para concurrencia, hilos y promesas de programación asincrona
         */

        Callable<String> callable = () -> {
          return "Resultado de la tarea";
        };

        Callable<String> callable2 = () ->  "Resultado de la tarea2"; //simplificando

        //puede ponerse una firma de exception en la declaració ndel método, pero se recomiendo mejor manejarlo por try catch
        try {
            String result = callable.call();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
