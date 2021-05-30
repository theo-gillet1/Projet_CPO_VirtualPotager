package com.example.virtualpotager;

import android.app.Application;


import java.util.ArrayList;
import java.util.List;

public class GlobalList extends Application {

    private List<Legume> LegumeList= new ArrayList<Legume>();;



    public List<Legume> getLegumeList() {
        return LegumeList;
    }

    public void setLegumeList(List<Legume> LegumeList) {
        this.LegumeList = LegumeList;
    }
}

