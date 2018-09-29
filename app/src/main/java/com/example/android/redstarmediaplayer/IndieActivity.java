package com.example.android.redstarmediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class IndieActivity extends GenresShellActivity {
    private MediaPlayer mMediaPlayer;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Parks, Squares, and Alleys", "We're Not Just Friends", R.drawable.parkssquaresalleys, R.raw.parkssquares));
        songs.add(new Song("Paramore", "That's What You Get", R.drawable.paramore1, R.raw.thatswhatyouget));
        songs.add(new Song("L'ONE feat. Jasmine", "Дорога", R.drawable.midnight1, R.raw.lostboy));


        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorPrimary);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);

                mMediaPlayer = MediaPlayer.create(IndieActivity.this, song.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
