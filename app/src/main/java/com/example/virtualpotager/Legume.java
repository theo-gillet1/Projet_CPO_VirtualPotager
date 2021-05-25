package com.example.virtualpotager;

public class Legume {


    private Integer Id;
    private String name;
    private String img;


    public Legume(String name, String img, int Id) {
        this.name = name;
        this.img = img;
        this.Id = Id;
    }

    public String getName(){return name;}

    public String getImg() {return img;}

    public Integer getId(){
        return Id;
    }

}
