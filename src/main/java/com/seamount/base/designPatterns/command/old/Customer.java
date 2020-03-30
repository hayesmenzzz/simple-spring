package com.seamount.base.designPatterns.command.old;

/**
 * @program: spring
 * @author: MENGHAISHAN
 * @create: 2020-03-30 23:00
 * @description: new Open这些动作是通过创建类将他们在对象之间传递，实际上Open，Save，Close
 * 这些类都是Lambda表达式，只是暂时藏在类的外壳下，他们是一种行为。
 **/
public class Customer {

    public static void main(String[] args) {
        Macro macro = new Macro();
        Editor editor = new EditorService();
        macro.record(new Open(editor));
        macro.record(new Save(editor));
        macro.record(new Close(editor));
        macro.run();

    }
}
