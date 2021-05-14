package com.example.virtualpotager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mon_Legume_Activite extends AppCompatActivity {

    private ImageButton bouton_retour_leg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon__legume);

        //Clic sur le bouton retour

        this.bouton_retour_leg = (ImageButton) findViewById(R.id.bouton_retour_leg);

        bouton_retour_leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), Mon_Potager_Activite.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}