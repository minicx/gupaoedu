package com.xcao.decorator;

/**
 * @Auther: minicx
 * @Date: 18-10-11 15:25
 * @Description:
 */
public class PlayerDecorator extends Player {
    protected Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("注意游戏时间啊，一个小时就要休息了！");
    }
}
