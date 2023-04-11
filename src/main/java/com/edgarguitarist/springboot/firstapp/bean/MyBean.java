package com.edgarguitarist.springboot.firstapp.bean;

public interface MyBean {
    void print();

    default void printWithDependency(String name){
        System.out.println("Este es un metodo opcional");
    };
    //crear metodo opcional

}
