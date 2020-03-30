package com.seamount.base.designPatterns.command.old;

/**
 * @program: spring
 * @author: MENGHAISHAN
 * @create: 2020-03-30 22:27
 * @description:
 **/
public class Close implements Action {
    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    public void other(){
        System.out.println("other...");
    }

    @Override
    public void cmd() {
        editor.close();
    }
}
