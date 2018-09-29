package com.example.android.redstarmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView store = findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(PlayingActivity.this, com.example.android.redstarmediaplayer.StoreActivity.class);
                startActivity(storeIntent);
            }
        });

        TextView playing = findViewById(R.id.playing);
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(PlayingActivity.this, com.example.android.redstarmediaplayer.PlayingActivity.class);
                startActivity(playingIntent);
            }
        });


        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(PlayingActivity.this, com.example.android.redstarmediaplayer.GenresShellActivity.class);
                startActivity(genresIntent);
            }
        });

        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(PlayingActivity.this, com.example.android.redstarmediaplayer.SongsActivity.class);
                startActivity(artistsIntent);
            }


        });


    }
}
