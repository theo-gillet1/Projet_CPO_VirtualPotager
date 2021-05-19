package com.example.virtualpotager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ma_Recherche extends AppCompatActivity {


    private ImageButton retour_accuiel;
    private ImageButton add_oignon;
    private ImageButton add_fraise;
    private ImageButton add_pommedeterre;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma__recherche);

        this.retour_accuiel = (ImageButton) findViewById(R.id.retour_accuiel);
        this.add_oignon = (ImageButton) findViewById(R.id.add_oignon);
        this.add_fraise = (ImageButton) findViewById(R.id.add_fraise);
        this.add_pommedeterre = (ImageButton) findViewById(R.id.add_pommedeterre);

        //Clic sur le bouton retour

        retour_accuiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });



        //Clic sur add oignon;

        add_oignon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LegumeListe.add(new Legume("oignon", "oignon"));


            }
        });

        //Clic sur add faise;

        add_fraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LegumeListe.add(new Legume("fraise", "fraise"));
                Toast.makeText(getApplicationContext(),"LegumeListe.size()",Toast.LENGTH_SHORT).show();

            }
        });

        //Clic sur add fraise;

        add_pommedeterre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LegumeListe.add(new Legume("pommedeterre", "pommedeterre"));
                Toast.makeText(getApplicationContext(),"LegumeListe.size()",Toast.LENGTH_SHORT).show();

            }
        });
    }
}