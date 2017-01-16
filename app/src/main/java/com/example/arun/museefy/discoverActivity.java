package com.example.arun.museefy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class discoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);


        TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(discoverActivity.this, NowPlaying.class);
                startActivity(homeIntent);
            }
        });

        TextView myMusic = (TextView) findViewById(R.id.myMusic);

        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(discoverActivity.this, myMusicActivity.class);
                startActivity(myMusicIntent);
            }
        });

        TextView buyMusic = (TextView) findViewById(R.id.buyMusic);
        buyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMusicIntent = new Intent(discoverActivity.this, buyMusicActivity.class);
                startActivity(buyMusicIntent);
            }
        });
    }

}


