package com.xcao.decorator;

/**
 * @Auther: minicx
 * @Date: 18-10-11 15:23
 * @Description:
 */
public class Player implements IPlayer {

    @Override
    public void play() {
        System.out.println("打游戏去了");
    }
}
