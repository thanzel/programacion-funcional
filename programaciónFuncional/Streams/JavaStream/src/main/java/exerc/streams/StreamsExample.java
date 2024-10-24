package exerc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        // operador final: termina el flujo, ya no se puede hacer mas nada
        // operador no final; es porque se debe continuar el flujo
        //

        // foreach es un consumer, es un operador final, porque ya no se puede hacer nada mas
        names.stream()
                .forEach((name) -> {
                    System.out.println(name);
                });

        System.out.println(" ");

        //simplificado
        names.stream()
                .forEach(System.out::println);

        System.out.println(" ");

        //filtrar: filter, sirve par afiltrar los elementos que cumplen una condición. Es un predicate. siempre definir el lambda, por lo que requiere un operador final para terminarlo
        names.stream()
                .filter((name) -> {
                    return name.length() > 4;
                })
                .forEach(System.out::println); //traea slo aquellos que cumplen la condición

        System.out.println(" ");

//map: trasnforma, modifica los elementos aplicando una condición
        names.stream()
                .map( (name)-> {
                    return  name.toUpperCase();
                })
                .forEach(System.out::println); //traea solo aquellos que cumplen la condición

        System.out.println(" ");

        // simplificando
        names.stream()
                .map( String::toUpperCase)
                .forEach(System.out::println); //traea slo aquellos que cumplen la condición
        System.out.println(" ");

        //filtramos solo lo que empiezan por a
        names.stream()
                .map( String::toUpperCase)
                .filter( (name) -> name.startsWith("A"))
                .forEach(System.out::println); //traea slo aquellos que cumplen la condición

        System.out.println(" ");

        //sorted: ordena los elementos, es comparator con lo que creas filtros personalizados de ordenamiento, es mas amplio
        names.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println(" ");
//FOREACH:
      /*  names.stream()
                .forEach((name) -> {
                    //consultas a bases de datos

                });*/

        System.out.println(" ");

        //reduce(): combina todos los elementos a un solo valor (en una linea), sirve par a juntar todos los elementos, reduce es un operador final como el foreach
        //requiere un identificador (identify) que lo que hace es poner una palabra antes de la cadena

        String result = names.stream()
                .reduce( "", (a, b) -> {
                    return a + " " + b;
                });

        //simplificado:
        String result2 = names.stream()
                .reduce( "", (a, b) ->  a + " " + b );

        System.out.println(result);
        System.out.println(result2);


        System.out.println(" ");

        //collect: Recoge todos los elementos en una colección, su función lambda es Collector, genera una nueva lista con lo obtenido en el stream

        List<String> result3 = names.stream()
                .map( (name) -> name.toUpperCase() )
                .collect(Collectors.toList());
/*
        List<String> result3 = names.stream()
                .map( (name) -> name.toUpperCase() )
                .toList(); //funciona en la versión 17 o 18 para arriba
*/
        result3.stream().forEach(System.out::println);

        System.out.println(" ");
        //Distinct: elimina los elementos duplicados, es operador intermedio no final
        names.stream()
                        .distinct()
                                .forEach(System.out::println);


        System.out.println(" ");
        //limit(): limita el numero de lementos procesados, no es final
        names.stream()
                .limit(3) //solo trae los 3 primeros
                .forEach(System.out::println);


        System.out.println(" ");
        //skip: omite un numero especifico de elemento
        names.stream()
                .skip(3) //salta los 3 primeros, no los tomaria en cuenta
                .forEach(System.out::println);

        System.out.println(" ");

        //anymatch: ve si alguno cumplió la condicion, es final ese operador
        boolean result4 = names.stream()
                .anyMatch( name -> name.startsWith("J")          );
        System.out.println(result4);

        System.out.println(" ");

        //allmatch(): ve si todos cumplen la condicion, es final ese operador
        boolean result5 = names.stream()
                .allMatch( name -> name.startsWith("J")          ); //todos inician por la J??? no
        System.out.println(result5);

        System.out.println(" ");
        //noneMatch: verifica si ningún cumple la condición
        boolean result6 = names.stream()
                .noneMatch( (name ) -> name.length() == 3          ); //si nungno cumple es true
        System.out.println(result6);

        System.out.println(" ");
    }


}
