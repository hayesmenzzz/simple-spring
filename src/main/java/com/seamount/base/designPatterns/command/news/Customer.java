package com.seamount.base.designPatterns.command.news;

import com.seamount.base.designPatterns.command.old.Editor;
import com.seamount.base.designPatterns.command.old.EditorService;
import com.seamount.base.designPatterns.command.old.Macro;
import org.junit.Test;

/**
 * @program: spring
 * @author: MENGHAISHAN
 * @create: 2020-03-30 23:04
 * @description: Open，Save，Close这些类实现了一个统一一个行为接口，而且类中只有一个方法，那这个类就只有这一个行为
 * 就是lambda,实际上主要是实现了Action接口，该接口只有一个抽象方法。就规定了它的实现类只有一个行为
 *
 * 如果Action中有多余的方法，那么就不是lambda就只能通过new的方式在对象之间传递，因为具有多种行为
 **/
public class Customer {
   /* public static void main(String[] args) {
        Macro macro = new Macro();
        Editor editor = new EditorService();
        macro.record(()->editor.open());
        macro.record(()->editor.save());
        macro.record(()->editor.close());
        macro.run();
    }

    @Test
    public void test(){
        Macro macro = new Macro();
        Editor editor = new EditorService();
        macro.record(editor::open);
        macro.record(editor::save);
        macro.record(editor::close);
        macro.run();
    }*/
}
