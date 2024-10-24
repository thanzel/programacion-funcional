package exerc.lambdas.runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /**
         * Runnable
         * No recibe parametros y no retorna nada, solo ejecuta una tarea
         * Es el padre de los hilos, se usa para concurrencia, hilos y promesas de programación asincrona
         */

        Runnable runnable = () -> {
            System.out.println("Ejecutando tarea...");
        };

        runnable.run();

        //Simplificando:
        Runnable runnable2 = () ->  System.out.println("Ejecutando tarea2...");

        runnable2.run();
    }
}
