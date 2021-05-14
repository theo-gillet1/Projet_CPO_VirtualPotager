package com.example.virtualpotager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mon_Potager_Activite extends AppCompatActivity {

    private Button bouton_oignon_potager;
    private Button bouton_fraise_potager;
    private Button bouton_pommedeterre_potager;
    private ImageButton bouton_retour_pota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon__potager__activite);

        //Clic sur le bouton fraise

        this.bouton_fraise_potager = (Button) findViewById(R.id.bouton_fraise_potager);

        bouton_fraise_potager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Legume_Activite.class);
                startActivity(otherActivity);
                finish();
            }
        });

        //Clic sur le bouton oignon

        this.bouton_oignon_potager = (Button) findViewById(R.id.bouton_oignon_potager);

        bouton_oignon_potager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Legume_Activite.class);
                startActivity(otherActivity);
                finish();
            }
        });


        //Clic sur le bouton pomme de terre

        this.bouton_pommedeterre_potager = (Button) findViewById(R.id.bouton_pommedeterre_potager);

        bouton_pommedeterre_potager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Legume_Activite.class);
                startActivity(otherActivity);
                finish();
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