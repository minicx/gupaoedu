package com.xcao.decorator;

/**
 * @Auther: minicx
 * @Date: 18-10-11 15:28
 * @Description:
 */
public class DecoratorTest {
    public static void main(String[] args) {
        IPlayer player = new PlayerDecorator(new Player());
        player.play();
    }
}
