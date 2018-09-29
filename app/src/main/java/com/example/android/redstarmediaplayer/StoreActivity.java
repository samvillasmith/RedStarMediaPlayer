package com.example.android.redstarmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);


        TextView store = (TextView) findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(StoreActivity.this, com.example.android.redstarmediaplayer.StoreActivity.class);
                startActivity(storeIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playing);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(StoreActivity.this, com.example.android.redstarmediaplayer.PlayingActivity.class);
                startActivity(playlistsIntent);
            }

            ;
        });


        TextView genres = findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(StoreActivity.this, com.example.android.redstarmediaplayer.GenresShellActivity.class);
                startActivity(genresIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(StoreActivity.this, com.example.android.redstarmediaplayer.SongsActivity.class);
                startActivity(artistsIntent);


            }
        });

    }


}

