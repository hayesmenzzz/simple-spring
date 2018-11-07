package com.seamount.spring.polymorphism;

public class ClassC implements InterfaceA {

    private String name;

    private Integer age = 15;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    public Integer getAge(){
        return age;
    }
}
