package com.seamount.spring.polymorphism;

public abstract class AbstractB implements InterfaceA {

    private InterfaceA interfaceA;

    void init(InterfaceA interfaceA) {
        this.interfaceA = interfaceA;
        this.init();
    }

    void init() {

    }

    public String getName() {
        if (interfaceA != null) {
            return interfaceA.getAge()+"";
        } else
            return "abstractB";
    }
}
