package com.example.virtualpotager;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import static com.example.virtualpotager.LegumeAdapter.*;


public class Mon_Potager_Activite extends AppCompatActivity {

    private Button bouton_oignon_potager;
    private Button bouton_fraise_potager;
    private Button bouton_pommedeterre_potager;
    private ImageButton bouton_retour_pota;
    private ImageButton bouton_supp_oignon_potager;
    private Mon_Potager_Activite potager_activite;
    private LinearLayout oignon_layout;
    public List<Legume> LegumeList;
    private  ImageButton add_oignon;
    private  ImageButton add_fraise;
    private  ImageButton add_pommedeterre;
    private ImageButton bouton_supp_legume_potager;
    private ImageButton bouton_legume_potager;





    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon__potager__activite);

        this.add_oignon = (ImageButton) findViewById(R.id.add_oignon);
        this.add_fraise = (ImageButton) findViewById(R.id.add_fraise);
        this.add_pommedeterre = (ImageButton) findViewById(R.id.add_pommedeterre);
        int id1 = 0;








        //get list view
        List<Legume> LegumeList = new ArrayList<>();
        LegumeList.add(new Legume("oignon", "oignon",id1));
        GridView potagerGridView = findViewById(R.id.potagerGridView);
        potagerGridView.setAdapter(new LegumeAdapter(this, LegumeList));




        //Clic sur le bouton retour
        this.bouton_retour_pota = (ImageButton) findViewById(R.id.bouton_retour_pota);
        bouton_retour_pota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherActivity);
                finish();

            }
        });


        //clic sur add oignon

        add_oignon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("oignon", "oignon",id1));
                GridView potagerGridView = findViewById(R.id.potagerGridView);
                potagerGridView.setAdapter(new LegumeAdapter(getApplicationContext(), LegumeList));
                int id1 =+ 1;
            }
        });


        //add Fraise
        add_fraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("fraise", "fraise",id1));
                GridView potagerGridView = findViewById(R.id.potagerGridView);
                potagerGridView.setAdapter(new LegumeAdapter(getApplicationContext(), LegumeList));
                int id1 =+1;
            }
        });



        //add pomme de terre
        add_pommedeterre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("Pomme_de_Terre", "pommedeterre",id1));
                GridView potagerGridView = findViewById(R.id.potagerGridView);
                potagerGridView.setAdapter(new LegumeAdapter(getApplicationContext(), LegumeList));
                int id1 =+1;
            }
        });


        /*this.bouton_supp_legume_potager = findViewById(1000000);
        this.bouton_legume_potager = findViewById(1000000);

        bouton_supp_legume_potager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.remove(0);
                GridView potagerGridView = findViewById(R.id.potagerGridView);
                potagerGridView.setAdapter(new LegumeAdapter(getApplicationContext(), LegumeList));
            }
        });

        bouton_legume_potager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Legume_Activite.class);
                startActivity(otherActivity);
                finish();
            }
        });*/

        }

    }
