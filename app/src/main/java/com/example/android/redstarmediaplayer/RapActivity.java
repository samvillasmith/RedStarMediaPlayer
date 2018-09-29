package com.example.android.redstarmediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RapActivity extends GenresShellActivity {
    private MediaPlayer mMediaPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Jeezy ft. Sunday Service", "Sweet Life", R.drawable.jeezy, R.raw.sweetlife));
        songs.add(new Song("Zach Hemsey", "I'll Find A Way", R.drawable.thewayzackhemsey, R.raw.illfindaway));
        songs.add(new Song("Zach Hemsey", "Waiting Between Worlds", R.drawable.thewayzackhemsey, R.raw.waitingbetweenworlds));
        songs.add(new Song("Big Scoob", "Walking the Line", R.drawable.bigscoob, R.raw.bigscoob));
        songs.add(new Song("Tech N9ne", "Cold Piece of Work", R.drawable.strangereign, R.raw.coldpiece));
        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorPrimary);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Song song = songs.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(com.example.android.redstarmediaplayer.RapActivity.this, song.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
