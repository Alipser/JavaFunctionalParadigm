package org.example;
@FunctionalInterface
public interface Trifunction<T,U,V, R> {

    public R apply(T t, U u, V v);

}
