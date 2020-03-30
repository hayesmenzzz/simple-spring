package com.seamount.base.designPatterns.command.old;

/**
 * 一个文本编辑器一般的功能，抽象这些不同的功能为同一个操作，只是命令不同而已。
 * 像open、save、close这些称之为命令，如果使用命令者模式调用的话，需要有一个统一的接口来概括这些不同的操作。
 *
 */
public interface Editor {

    void save();

    void open();

    void close();
}
