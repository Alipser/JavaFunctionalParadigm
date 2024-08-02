package org.example;

import java.util.function.*;

public  class Calculadora {

    public static BiFunction<Double,Double, Double> suma = (x, y) -> x + y  ;
    public static Function<Double,Double > doble = new Function<>() {
        @Override
        public Double apply(Double number) {
            return  number*2;
        }
    };

    public static Predicate<String> isA = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.equals("a");
        }
    };

    public static Consumer<Object> sayHello = new Consumer<Object>() {
        @Override
        public void accept(Object object) {

            System.out.println("Hola");
        }
    };

    public static Supplier<String> supPrueba = new Supplier<String>() {
        @Override
        public String get() {
            return "Hola Mundo";
        }
    };

    public static  Trifunction<Integer, Integer, Integer, Integer> triSuma = new Trifunction<Integer, Integer, Integer, Integer>() {
        @Override
        public Integer apply(Integer x, Integer y, Integer z) {
            return x+y+z;
        }
    };

}
