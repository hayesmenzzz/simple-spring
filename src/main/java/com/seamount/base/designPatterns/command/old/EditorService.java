package com.seamount.base.designPatterns.command.old;

/**
 * @program: spring
 * @author: MENGHAISHAN
 * @create: 2020-03-30 23:04
 * @description:
 **/
public class EditorService implements Editor {
    @Override
    public void save() {
        System.out.println("save...");
    }

    @Override
    public void open() {
        System.out.println("open...");
    }

    @Override
    public void close() {
        System.out.println("close...");
    }
}
