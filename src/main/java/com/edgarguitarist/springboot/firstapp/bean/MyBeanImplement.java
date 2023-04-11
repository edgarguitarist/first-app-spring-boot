package com.edgarguitarist.springboot.firstapp.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del bean");
    }

    @Override
    public void printWithDependency(String name) {
     System.out.println("Hola desde mi implementación propia del bean con dependencia " + name);
    }
}
