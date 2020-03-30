package com.seamount.base.designPatterns.command.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: spring
 * @author: MENGHAISHAN
 * @create: 2020-03-30 22:27
 * @description:   现在可以实现宏类，改类record记录操作命令，然后一起运行。
 * 我们使用list保存操作序列，然后调用foreach方法，按照顺序执行每一个action
 **/
public class Macro {

    private final List<Action> actions;

    public Macro() {
        this.actions = new ArrayList<Action>();
    }

    public void record(Action action){
        actions.add(action);
    }

    public void run(){
        actions.forEach(Action::cmd);
    }
}
