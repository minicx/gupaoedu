package com.xcao.adapter;

/**
 * @Auther: minicx
 * @Date: 18-10-11 14:15
 * @Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.play("mp3", "O(∩_∩)O哈哈~");
    }
}
