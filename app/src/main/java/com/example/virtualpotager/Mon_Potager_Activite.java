package com.example.virtualpotager;


import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.List;



public class Mon_Potager_Activite extends AppCompatActivity {

    private ImageButton bouton_retour_pota;
    private  ImageButton add_oignon;
    private  ImageButton add_fraise;
    private  ImageButton add_pommedeterre;
    private List<Legume> LegumeList = new ArrayList<Legume>();





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
        GlobalList globalList = (GlobalList)getApplicationContext();
        List<Legume> LegumeList = globalList.getLegumeList();
        globalList.setLegumeList(LegumeList);
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

        }

    }
