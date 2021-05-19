package com.example.virtualpotager;

public class Legume {

    private String name;
    private String img;
    public Integer Id;

    public Legume(String name, String img) {
        this.name = name;
        this.img = img;
        this.Id = 0;
    }

    public String getName(){return name;}

    public String getImg() {return img;}

    public void setId(int id){
        this.Id = id;
    }

}
