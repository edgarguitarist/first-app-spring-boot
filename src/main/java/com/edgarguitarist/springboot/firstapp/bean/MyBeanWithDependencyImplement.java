package com.edgarguitarist.springboot.firstapp.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde mi implementación propia del bean con dependencia");
    }
}
