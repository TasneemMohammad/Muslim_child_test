package com.example.l;

public class Stories_Card {
    private String nameStory ;
    private int img ;
    private int sound ;

    public String getNameStory() {
        return nameStory;
    }
    public void setNameStory(String nameStory) {
        this.nameStory = nameStory;
    }

    public Stories_Card(String nameStory, int img) {
        this.nameStory = nameStory;
        this.img = img;
    }

    public Stories_Card(String nameStory, int img, int sound) {
        this.nameStory = nameStory;
        this.img = img;
        this.sound = sound;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
}
