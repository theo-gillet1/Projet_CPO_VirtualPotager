package com.example.virtualpotager;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button bouton_potager_accueil;
    private Button bouton_recherche_accueil;





    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //FlutterMain.startInitialization(this);
        setContentView(R.layout.activity_main);

        this.bouton_recherche_accueil = (Button) findViewById(R.id.bouton_rechercher_accueil);
        this.bouton_potager_accueil = (Button) findViewById(R.id.bouton_potager_accueil);

        bouton_potager_accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Potager_Activite.class);
                startActivity(otherActivity);
                finish();
            }
        });

        bouton_recherche_accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Ma_Recherche.class);
                startActivity(otherActivity);
                finish();
            }
        });



    }

}