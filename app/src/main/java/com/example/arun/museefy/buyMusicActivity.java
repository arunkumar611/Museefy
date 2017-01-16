package com.example.arun.museefy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class buyMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);

        TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(buyMusicActivity.this, NowPlaying.class);
                startActivity(homeIntent);
            }
        });

        TextView myMusic = (TextView) findViewById(R.id.myMusic);
        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(buyMusicActivity.this, myMusicActivity.class);
                startActivity(myMusicIntent);
            }
        });

        TextView discover = (TextView) findViewById(R.id.discover);
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(buyMusicActivity.this, discoverActivity.class);
                startActivity(discoverIntent);
            }
        });

    }

}


