package com.seamount.spring.polymorphism;

/**
 * Ploymorphism 多态
 * 面向借口的变成有一个最大的好处是方便扩展。B类中有一个成员变量的类型是A，
 * 比如说再有一个C impl A，那么B 中可以存放C对象，如果还有另外一个D也impl了A，
 * 同样也可以存放D的实例化对象（java的三大特性之一：多态），在不确定的情况下，就只好定义接口A，
 * 又下级调用者赋值，最根本的目的是为了程序的可扩展性。
 */
public class Test {
    public static void main(String[] args) {
        AbstractB b = new AbstractB() {
            @Override
            public void setName(String name) {
            }

            @Override
            public Integer getAge() {
                return null;
            }
        };
        ClassC c = new ClassC();
        b.init(c);
        System.out.println(b.getAge());
        System.out.println(b.getName());
    }
}
