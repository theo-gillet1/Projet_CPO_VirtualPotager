package com.example.virtualpotager;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon__potager__activite);

        this.add_oignon = (ImageButton) findViewById(R.id.add_oignon);

        //get list view
        List<Legume> LegumeList = new ArrayList<>();
        LegumeList.add(new Legume("oignon", "oignon"));
        LegumeList.add(new Legume("oignon", "oignon"));
        LegumeList.add(new Legume("fraise", "fraise"));
        LegumeList.add(new Legume("oignon", "oignon"));
        GridView potagerGridView = findViewById(R.id.potagerGridView);
        potagerGridView.setAdapter(new LegumeAdapter(this, LegumeList));




        //clic sur add oignon

        add_oignon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegumeList.add(new Legume("oignon", "oignon"));
                GridView potagerGridView = findViewById(R.id.potagerGridView);
                potagerGridView.setAdapter(new LegumeAdapter(getApplicationContext(), LegumeList));
            }
        });




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

    }
}