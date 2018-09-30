package com.springmvc.study1.soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    //一个唱片应该有多个歌曲
    private List<String > tracks;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("playing"+title+"by"+artist);
        for(String track:tracks){
            System.out.println("-track:"+track);
        }
    }
}
