package com.example.virtualpotager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;
import android.widget.LinearLayout;

public class Mon_Legume_Activite extends AppCompatActivity {

    private ImageButton bouton_retour_leg;
    private Button button_obs;
    private Activity activity;


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

        // clic sur obs


        this.button_obs = (Button) findViewById(R.id.button_obs);
        this.activity = this;
        button_obs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Observation_Popup Popup = new Observation_Popup(activity);
                Popup.setTitle(getResources().getString(R.string.Titre_Observation_Popup));
                Popup.setSubTitle(getResources().getString(R.string.Description_Observation_Popup));
                Popup.getConfirmation().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Popup.dismiss();
                    }
                });
                Popup.build();

            }
        });

    }
}