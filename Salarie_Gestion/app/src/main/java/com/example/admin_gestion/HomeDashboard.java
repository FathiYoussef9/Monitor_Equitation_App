package com.example.admin_gestion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeDashboard extends AppCompatActivity implements View.OnClickListener{
    private CardView EmploiTemps,Taches,Seances,users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);
        //defining Cards
        Seances = (CardView) findViewById(R.id.SeancesId);
        //Add Click Listener to the cards
        Seances.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.SeancesId : i = new Intent(this,Seances.class);startActivity(i);break;
            default:break;
        }
    }
}