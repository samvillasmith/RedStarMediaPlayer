package com.example.android.redstarmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;


import static com.example.android.redstarmediaplayer.R.*;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, raw.lisztomania);

        Button playButton = findViewById(id.play_pause_button);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });


        TextView store;
        store = findViewById(id.store);
        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, com.example.android.redstarmediaplayer.StoreActivity.class);
                startActivity(storeIntent);
            }
        });

        TextView playing;
        playing = findViewById(id.playing);
        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, com.example.android.redstarmediaplayer.PlayingActivity.class);
                startActivity(playingIntent);
            }
        });


        TextView genres = findViewById(id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, com.example.android.redstarmediaplayer.GenresShellActivity.class);
                startActivity(genresIntent);
            }
        });

        TextView artists;
        artists = findViewById(id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, com.example.android.redstarmediaplayer.SongsActivity.class);
                startActivity(artistsIntent);
            }


        });



    }
}








