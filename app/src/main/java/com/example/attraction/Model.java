package com.example.attraction;

public class Model {

    int image;
    String name;
    String info;
    String video_url;

    public Model(int image, String name, String info, String video_url){
        this.image = image;
        this.name = name;
        this.info = info;
        this.video_url = video_url;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {return info; }

    public void setInfo(String info) {this.info = info; }

    public String getVideo_url() {return video_url; }

    public void setVideo_url(String video_url) {this.video_url = video_url; }
}
