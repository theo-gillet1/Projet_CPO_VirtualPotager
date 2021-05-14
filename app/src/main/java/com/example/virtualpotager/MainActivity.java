package com.example.virtualpotager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button bouton_potager_accueil;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bouton_potager_accueil = (Button) findViewById(R.id.bouton_potager_accueil);

        bouton_potager_accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Potager_Activite.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }

}