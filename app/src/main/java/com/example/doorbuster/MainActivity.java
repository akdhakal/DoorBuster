package com.example.doorbuster;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

//Testing if the git is working
public class MainActivity extends AppCompatActivity {

    private Button but_recCap, but_liveFeed, but_grantAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bg));
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        //Setting custom image for the action bar
        actionBar.setDisplayShowCustomEnabled(true);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.customlogo,null);
        actionBar.setCustomView(view);

        but_recCap = findViewById(R.id.but_recentCap);
        but_recCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecCap();
            }
        });

        but_liveFeed = findViewById(R.id.but_liveFeed);
        but_liveFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openliveFeed();
            }
        });

        but_grantAcc = findViewById(R.id.but_grantAccess);
        but_grantAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengrantAcc();
            }
        });

    }

    public void openRecCap(){
        Intent intent = new Intent(this, act_RecCap.class);
        startActivity(intent);
    }


    public void openliveFeed(){
        Intent intent = new Intent(this, act_LiveFeed.class);
        startActivity(intent);
    }


    public void opengrantAcc(){
        Intent intent = new Intent(this, act_GrantAccess.class);
        startActivity(intent);
    }
}