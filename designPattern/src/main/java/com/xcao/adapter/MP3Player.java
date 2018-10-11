package com.xcao.adapter;

/**
 * @Auther: minicx
 * @Date: 18-10-11 14:14
 * @Description:
 */
public class MP3Player implements AdvancedMediaPlayer{
    @Override
    public void playMP3(String file) {
        System.out.println(file + ":" + "使用mp3的格式播放");
    }

    @Override
    public void playMP4(String file) {
    }
}
