package com.seamount.base.designPatterns.command.old;

/**
 * @program: spring
 * @author: MENGHAISHAN
 * @create: 2020-03-30 22:26
 * @description:
 **/
public class Save implements Action{

    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void cmd() {
        editor.save();
    }

    @Override
    public void other() {

    }
}
