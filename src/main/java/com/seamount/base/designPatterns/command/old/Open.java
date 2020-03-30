package com.seamount.base.designPatterns.command.old;

/**
 * @program: spring
 * @description: ${description}
 * @author: MENGHAISHAN
 * @create: 2020-03-30 22:21
 * <p>
 * 这些具体的执行命令的类中要做的只需要是在action中调用Editor类中的一个具体的方法。
 *
 * 我们准讯恰当的命名规范，用类名代表操作
 **/
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void cmd() {
        editor.open();
    }

    @Override
    public void other() {

    }
}
