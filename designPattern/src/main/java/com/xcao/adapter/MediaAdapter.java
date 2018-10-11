package com.xcao.adapter;

/**
 * @Auther: minicx
 * @Date: 18-10-11 14:10
 * @Description:
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp3") ){
            advancedMediaPlayer = new MP3Player();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String type, String file) {
        if ("mp3".equals(type)) {
            advancedMediaPlayer.playMP3(file);
        } else if ("mp4".equals(type)) {
            advancedMediaPlayer.playMP4(file);
        }
    }
}
