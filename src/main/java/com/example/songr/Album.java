package com.example.songr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {
    @Id // id SERIAL PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageURL;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Song> songs = new ArrayList();

    public Album() {}

    public Album(String title, String artist, int songCount, int length, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }
    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
