package com.example.virtualpotager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;

import java.util.List;

public class LegumeAdapter extends BaseAdapter {

    private Context context;
    private List<Legume> legumeList;
    private LayoutInflater inflater;

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

        Legume CurrentLegume = getItem(position);
        String LegumeName = CurrentLegume.getName();
        String img = CurrentLegume.getImg();

        //get legume img
        ImageButton LegumeImage = view.findViewById(R.id.bouton_oignon_potager);
        String rssName = img + "_img";
        int resId = context.getResources().getIdentifier(rssName, "drawable", context.getPackageName());
        LegumeImage.setImageResource(resId);
        

        return view;
    }
}
