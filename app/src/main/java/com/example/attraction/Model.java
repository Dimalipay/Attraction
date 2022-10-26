package com.example.attraction;

public class Model {

    int image;
    String name;
    String info;

    public Model(int image, String name, String info){
        this.image = image;
        this.name = name;
        this.info = info;
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
}
