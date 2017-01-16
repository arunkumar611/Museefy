package com.example.arun.museefy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView myMusic = (TextView) findViewById(R.id.myMusic);
        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(NowPlaying.this, myMusicActivity.class);
                startActivity(myMusicIntent);
            }
        });

        TextView discover = (TextView) findViewById(R.id.discover);
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(NowPlaying.this, discoverActivity.class);
                startActivity(discoverIntent);
            }
        });

        TextView buyMusic = (TextView) findViewById(R.id.buyMusic);
        buyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyMusicIntent = new Intent(NowPlaying.this, buyMusicActivity.class);
                startActivity(buyMusicIntent);
            }
        });
    }
}


