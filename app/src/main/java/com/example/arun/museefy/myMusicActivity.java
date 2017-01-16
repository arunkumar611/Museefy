package com.example.arun.museefy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Arun on 1/16/2017.
 */

public class myMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(myMusicActivity.this, NowPlaying.class);
                startActivity(homeIntent);
            }
        });

        TextView discover = (TextView) findViewById(R.id.discover);
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(myMusicActivity.this, discoverActivity.class);
                startActivity(discoverIntent);
            }
        });

        TextView buyMusic = (TextView) findViewById(R.id.buyMusic);
        buyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMusicIntent = new Intent(myMusicActivity.this, buyMusicActivity.class);
                startActivity(buyMusicIntent);
            }
        });


    }
}

