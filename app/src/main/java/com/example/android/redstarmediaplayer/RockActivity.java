package com.example.android.redstarmediaplayer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends GenresShellActivity {
    private MediaPlayer mMediaPlayer;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("30 Seconds to Mars", "From Yesterday", R.drawable.fromyesterday, R.raw.fromyesterday));
        songs.add(new Song("Panic! At the Disco", "Nine in the Afternoon", R.drawable.panicalbum, R.raw.nineintheafternoon));
        songs.add(new Song("Breaking Benjamin", "Unknown Soldier", R.drawable.breakingbenjamin, R.raw.unknownsoldier));
        songs.add(new Song("Paramore", "That's What You Get", R.drawable.paramore1, R.raw.thatswhatyouget));
        songs.add(new Song("Phoenix", "1901", R.drawable.phoenix, R.raw.lisztomania));


        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorPrimary);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);

                mMediaPlayer = MediaPlayer.create(RockActivity.this, song.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
