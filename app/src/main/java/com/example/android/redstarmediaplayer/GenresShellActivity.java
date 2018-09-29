package com.example.android.redstarmediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GenresShellActivity extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        {
            TextView store;
            store = findViewById(R.id.store);
            store.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent storeIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.StoreActivity.class);
                    startActivity(storeIntent);
                }
            });

            TextView playlists;
            playlists = findViewById(R.id.playing);
            playlists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playlistsIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.PlayingActivity.class);
                    startActivity(playlistsIntent);
                }
            });


            TextView genres = findViewById(R.id.genres);
            genres.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent genresIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.GenresShellActivity.class);
                    startActivity(genresIntent);
                }
            });
            TextView artists;
            artists = findViewById(R.id.artists);
            artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent artistsIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.SongsActivity.class);
                    startActivity(artistsIntent);
                }


            });
        }
        TextView indie;
        indie = findViewById(R.id.indie);
        indie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indieIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.IndieActivity.class);
                startActivity(indieIntent);
            }


        });

        TextView rap;
        rap = findViewById(R.id.rap);
        rap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.RapActivity.class);
                startActivity(rapIntent);
            }


        });

        TextView russian;
        russian = findViewById(R.id.russian);
        russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent russianIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.RussianActivity.class);
                startActivity(russianIntent);
            }


        });

        TextView rock;
        rock = findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(GenresShellActivity.this, com.example.android.redstarmediaplayer.RockActivity.class);
                startActivity(rockIntent);
            }


        });
    }
};




