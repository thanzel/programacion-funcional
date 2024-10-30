![PROGRAMACIÓN FUNCIONAL](https://github.com/user-attachments/assets/9c5542a6-5e60-4745-84b5-f48719e1c61f)


# Interfaces funcionales
Se utilizan para crear expresiones lambda y métodos de referencia en Java, facilitando la programación funcional y el uso de streams, te presento algunas:

## Consumer<T>
  - Método abstracto: void accept(T t);
  
  Función que representa una operación que toma un argumento y no devuelve ningún resultado, Se usa comúnmente para operaciones que modifican el estado, ejemplo: 
```
Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
printUpperCase.accept("hello"); // HELLO
```

## Function<T, R>  
  - Método abstracto: R apply(T t);
  
  Representa una función que toma un argumento y devuelve un resultado de tipo diferente, veamos: 
  ```
Function<String, Integer> stringLength = s -> s.length();
System.out.println(stringLength.apply("Hello")); // 5
```
  
## Predicate<T> 
  - Método abstracto: boolean test(T t);
  
  Función que toma un argumento y devuelve un valor booleano true o false, este se utiliza normalmente para almacenar condiciones que luego van a ser usadas en filtros, así: 
```
Predicate<String> isEmpty = s -> s.isEmpty();
System.out.println(isEmpty.test("")); // true
```
  
## Supplier<T>  
  - Método abstracto: T get();
  
  Función que proporciona un resultado sin tomar argumentos, ejemplo: 
```
Supplier<Double> randomNumber = () -> Math.random();
System.out.println(randomNumber.get()); // Ejemplo: 0.123456
```
  
## BiConsumer<T, U> 
  - Método abstracto: void accept(T t, U u);
  
  Acepta dos argumentos y no devuelve resultado, así:
```
BiConsumer<String, String> printConcatenated = (a, b) -> System.out.println(a + b);
printConcatenated.accept("Hello, ", "World!"); // Hello, World!
```

 ## BiFunction<T, U, R> 
  - Método abstracto: R apply(T t, U u);
  
  Similar a Function<T, T> pero toma dos argumentos en lugar de uno  y devuelve un resultado, ejemplo: 
```
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;        
System.out.println("La suma de 5 y 3 es: " +  add.apply(5, 3));
```
  
## BiPredicate<T, U>  
  - Método abstracto: boolean test(T t, U u);
  
  Similar al Predicate<T> pero la diferencia es que toma dos argumentos en lugar de uno, veamos:
```
BiPredicate<Integer, Integer> areEqual = (a, b) -> a.equals(b);
System.out.println("¿5 y 5 son iguales? " + areEqual.test(5, 5));
```
  
## UnaryOperator<T> 
  - Método abstracto: T apply(T t);
  
  Es un tipo especial de Function<T, T> que aplica una operación sobre un solo tipo, ejemplo:
  ```
UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(4));
```
  
## BinaryOperator<T> 
  - Método abstracto: T apply(T t1, T t2);
  
  Tipo especial de BiFunction<T, T, T> que toma dos argumentos del mismo tipo y devuelve un resultado del mismo tipo
```
BinaryOperator<Integer> multiply = (a, b) -> a * b; 
  System.out.println(multiply.apply(3, 4));
