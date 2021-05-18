package com.example.virtualpotager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon__potager__activite);


        //Liste des Legumes
        List<Legume> LegumeList = new ArrayList<>();
        LegumeList.add(new Legume("oignon", "oignon"));
        LegumeList.add(new Legume("fraise","fraise"));
        LegumeList.add(new Legume("pomme de terre", "pommedeterre"));

        //get list view
        GridView potagerGridView = findViewById(R.id.potagerGridView);
        potagerGridView.setAdapter(new LegumeAdapter(this, LegumeList));



    }
}