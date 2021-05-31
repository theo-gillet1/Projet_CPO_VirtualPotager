package com.example.virtualpotager;

public class Legume {


    private Integer Id;
    private String name;
    private String img;
    private String cat;


    public Legume(String name, String img, int Id, String Categorie) {
        this.name = name;
        this.img = img;
        this.Id = Id;
        this.cat = Categorie;
    }

    public String getName(){return name;}

    public String getImg() {return img;}

    public Integer getId(){
        return Id;
    }

    public String getCat() {return cat; }

}
