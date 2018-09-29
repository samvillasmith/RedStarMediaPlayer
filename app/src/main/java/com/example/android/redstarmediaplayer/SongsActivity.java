package com.example.android.redstarmediaplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;


public class SongsActivity extends AppCompatActivity {
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
        songs.add(new Song("Parks, Squares, and Alleys", "We're Not Just Friends", R.drawable.parkssquaresalleys, R.raw.parkssquares));
        songs.add(new Song("Paramore", "That's What You Get", R.drawable.paramore1, R.raw.thatswhatyouget));
        songs.add(new Song("L'ONE feat. Jasmine", "Дорога", R.drawable.midnight1, R.raw.lostboy));
        songs.add(new Song("L'ONE", "Океан", R.drawable.loneokean, R.raw.loneokean));
        songs.add(new Song("Jiye Kim", "In Your Love", R.drawable.inyourlove, R.raw.inyourlove));
        songs.add(new Song("Phoenix", "1901", R.drawable.phoenix, R.raw.lisztomania));
        songs.add(new Song("Panic! At the Disco", "Nine in the Afternoon", R.drawable.panicalbum, R.raw.nineintheafternoon));


        SongAdapter adapter = new SongAdapter(this, songs, R.color.colorPrimary);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song word = songs.get(position);
                mMediaPlayer = MediaPlayer.create(SongsActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();

            }
        });



    }
}
