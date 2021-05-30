package com.example.virtualpotager;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

public class LegumeAdapter extends BaseAdapter {

    private Context context;
    private List<Legume> legumeList;
    private LayoutInflater inflater;
    private LinearLayout Layout;

    //constructeur
    public LegumeAdapter(Context context,List<Legume> LegumeListe){
        this.context = context;
        this.legumeList = LegumeListe;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return legumeList.size();
    }

    @Override
    public Legume getItem(int position) {
        return legumeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.model_legume, null);
        this.Layout = view.findViewById(R.id.Legume_layout);
        Legume CurrentLegume = getItem(position);
        String LegumeName = CurrentLegume.getName();
        String img = CurrentLegume.getImg();



        //Set Id image Legume and supp legume
        int id = CurrentLegume.getId();




        //bouton supp
        ImageButton imgsupp = new ImageButton(context);
        ViewGroup.LayoutParams paramsup = new ActionBar.LayoutParams(120,120);
        imgsupp.setLayoutParams(paramsup);
        int croix = context.getResources().getIdentifier("ic_croix","drawable", context.getPackageName());
        imgsupp.setImageResource(croix);
        imgsupp.setId(100+id);
        Layout.addView(imgsupp);

        //text nom legume
        TextView txtnom = new TextView(context);
        ViewGroup.LayoutParams paramstxt = new ActionBar.LayoutParams(400,100);
        txtnom.setText(LegumeName);
        txtnom.setTextAppearance(context,R.style.txt_Recherche);
        Layout.addView(txtnom);



        //bouton image legume

        ImageButton IMG = new ImageButton(context);
        ViewGroup.LayoutParams params = new ActionBar.LayoutParams(400,400);
        IMG.setLayoutParams(params);
        String rssName = img + "_img";
        int resId = context.getResources().getIdentifier(rssName, "drawable", context.getPackageName());
        IMG.setImageResource(resId);
        IMG.setPadding(2,2,2,2);
        IMG.getAdjustViewBounds();
        IMG.setAdjustViewBounds(true);
        IMG.setId(id);
        Layout.addView(IMG);


        //cliquer sur bouton supp
        imgsupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder PopupSup = new AlertDialog.Builder(v.getRootView().getContext());
                PopupSup.setMessage("Voulez vous supprimer ce légume de votre potager ?");
                PopupSup.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context,"le légume a été déraciné !", Toast.LENGTH_SHORT).show();
                        legumeList.remove(position);
                        notifyDataSetInvalidated();

                    }
                });
                PopupSup.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context,"le légume n'a pas été déraciné !", Toast.LENGTH_SHORT).show();
                    }
                });
                PopupSup.show();
            }
        });


        //cliquer sur bouton legume
        IMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(context, Mon_Legume_Activite.class);
                otherActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(otherActivity);
                //((Activity)context).finish();
            }
        });



        return view;
    }

}
