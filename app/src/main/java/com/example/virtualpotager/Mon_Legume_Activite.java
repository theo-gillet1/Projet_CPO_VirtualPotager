package com.example.virtualpotager;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.app.Activity;
import android.widget.LinearLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mon_Legume_Activite extends AppCompatActivity {

    private ImageButton bouton_retour_leg;
    private Button button_obs;
    private Activity activity;
    private String LegCat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon__legume);
        Intent intent = getIntent();
        String LegCat = intent.getStringExtra(LegumeAdapter.EXTRA_TEXT);

        this.activity = this;

        //Si le legume cliqué est une pomme de terre
        if (LegCat.equals("pdt")) {


            //base de données de la pomme de terre --> Partie Objectif
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference obj = (DatabaseReference) database.getReference().child("Legumes").child("Legume1").child("Information").child("Objectif");
            obj.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    List<String> list = new ArrayList<>();
                    for (DataSnapshot ds : snapshot.getChildren()) {
                        String uid = ds.getKey();
                        list.add(uid);
                    }
                    for (int i = 0; i < list.size(); i++) {
                        String clé = list.get(i);

                        DatabaseReference Obj = (DatabaseReference) obj.child(clé);
                        Obj.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot1) {
                                String data = Objects.requireNonNull(snapshot1.getValue()).toString();
                                LinearLayout ObjLayout = (LinearLayout) findViewById(R.id.ObjectifLayout);
                                CheckBox checkBox = new CheckBox(getApplicationContext());
                                ViewGroup.LayoutParams params = new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                checkBox.setLayoutParams(params);
                                checkBox.setText(data);

                                ObjLayout.addView(checkBox);
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });









            //base de données de la pomme de terre --> Partie Observation
            FirebaseDatabase database2 = FirebaseDatabase.getInstance();
            DatabaseReference obs = (DatabaseReference) database2.getReference().child("Legumes").child("Legume1").child("Information").child("Observation");
            obs.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot3) {
                    List<String> liste = new ArrayList<>();
                    for (DataSnapshot ds : snapshot3.getChildren()) {
                        String uid = ds.getKey();
                        liste.add(uid);
                    }
                    for (int y = 0; y < liste.size(); y++) {
                        String clée = liste.get(y);

                        DatabaseReference Obs = (DatabaseReference) obs.child(clée);
                        Obs.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot2) {
                                String txt = Objects.requireNonNull(snapshot2.getValue()).toString();
                                LinearLayout ObsLayout = (LinearLayout) findViewById(R.id.ObservationLayout);
                                Button ObsButton = (Button) new Button(getApplicationContext());
                                ViewGroup.LayoutParams params = new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                ObsButton.setLayoutParams(params);
                                ObsButton.setText(clée);
                                ObsLayout.addView(ObsButton);

                                ObsButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        final Observation_Popup Popup = new Observation_Popup(activity);
                                        Popup.setTitle(clée);
                                        Popup.setSubTitle(txt);
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

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });


        }




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