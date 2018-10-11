package com.xcao.adapter;

/**
 * @Auther: minicx
 * @Date: 18-10-11 14:16
 * @Description:
 */
public class MediaPlayerImpl implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String file) {
        mediaAdapter = new MediaAdapter(type);
        mediaAdapter.play(type, file);
    }
}
