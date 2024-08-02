package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(Calculadora.suma.apply(4.0,5.5));
        System.out.println(Calculadora.doble.apply(5.0));
        System.out.println(Calculadora.isA.test("a"));

        double[] lista  = {1.0, 2.0};
        List<Double> lista2 =new ArrayList<>(Arrays.asList(1.0, 2.0));
        Stream<String> coursesStream = Arrays.stream(new String[]{"hola", "Java"});

        Arrays.stream(lista).forEach(x->{
            Calculadora.sayHello.accept(x);
        });

        List<String> lista3 = new ArrayList<>();
        lista3.add("Hola");
        lista3.add("Mundo");
        String[] array = lista3.toArray(new String[0]);
        System.out.println(array[0] +" "+  array[1]+ "length: " + array.length);

        System.out.println(Calculadora.supPrueba.get());
        System.out.println(Calculadora.triSuma.apply(1,2,3));

        Function<Double, Double> sum1  = x -> x +1;

        Arrays.stream(lista).forEach(Main::newSum1);

        Stream<String> explicitOperationStream = coursesStream.filter( x -> x.contains("Java"));



    }

    public static Double newSum1 (Double valor){
        System.out.println(valor+1);
        return valor + 1;
    }


}