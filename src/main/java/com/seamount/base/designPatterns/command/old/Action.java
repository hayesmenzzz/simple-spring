package com.seamount.base.designPatterns.command.old;

/**
 * 定义一个通用操作的父类，所有具体的操作需要实现该接口，
 */
public interface Action {
    void cmd();

    void other();
}
