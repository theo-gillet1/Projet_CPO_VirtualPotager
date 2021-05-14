package com.example.virtualpotager;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;

import static android.app.ProgressDialog.show;

public class Observation_Popup extends Dialog {
    private String Title, Description;
    private Button Confirmation;
    private TextView titleView,DescriptionView;


    public Observation_Popup(Activity activity) {
        super(activity, R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.popup_observation);
        this.Title = "Titre_Observation_Popup";
        this.Description = "Description_Observation_Popup";
        this.Confirmation = (Button) findViewById(R.id.Confirmer);
        this.titleView = (TextView) findViewById(R.id.titre_obs_popup);
        this.DescriptionView = (TextView) findViewById(R.id.description_popup);
    }

    public void setTitle(String Title){this.Title = Title;}
    public void setSubTitle(String Description){this.Description = Description;}
    public Button getConfirmation(){return Confirmation;}

    public void build(){
        show();
        titleView.setText(Title);
        DescriptionView.setText(Description);

    }

}
