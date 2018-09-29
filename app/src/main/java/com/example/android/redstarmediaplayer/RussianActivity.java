package com.example.android.redstarmediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RussianActivity extends GenresShellActivity {
    private MediaPlayer mMediaPlayer;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("L'ONE feat. Jasmine", "Дорога", R.drawable.lonedoroga1, R.raw.lonefeatjasmine));
        songs.add(new Song("L'ONE", "Океан", R.drawable.loneokean, R.raw.loneokean));
        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorPrimary);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);

                mMediaPlayer = MediaPlayer.create(RussianActivity.this, song.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
