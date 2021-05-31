package com.example.virtualpotager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


public class Ma_Recherche extends AppCompatActivity {


    private ImageButton retour_accuiel;
    private ImageButton add_oignon;
    private ImageButton add_fraise;
    private ImageButton add_pommedeterre;
    private List<Legume> LegumeList = new ArrayList<Legume>();




    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma__recherche);

        this.retour_accuiel = (ImageButton) findViewById(R.id.retour_accuiel);
        this.add_oignon = (ImageButton) findViewById(R.id.add_oignon);
        this.add_fraise = (ImageButton) findViewById(R.id.add_fraise);
        this.add_pommedeterre = (ImageButton) findViewById(R.id.add_pommedeterre);
        int id1 = 0;


        //get list view
        GlobalList globalList = (GlobalList)getApplicationContext();
        List<Legume> LegumeList = globalList.getLegumeList();
        globalList.setLegumeList(LegumeList);


        //Clic sur le bouton retour
        retour_accuiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        //add oignon
        add_oignon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("oignon", "oignon",id1,"oig"));
                globalList.setLegumeList(LegumeList);
                int id1 =+ 1;
            }
        });


        //add Fraise
        add_fraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("fraise", "fraise",id1,"fra"));
                globalList.setLegumeList(LegumeList);
                int id1 =+1;
            }
        });



        //add pomme de terre
        add_pommedeterre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("Pomme de Terre", "pommedeterre",id1,"pdt"));
                globalList.setLegumeList(LegumeList);
                int id1 =+1;
            }
        });




    }
}