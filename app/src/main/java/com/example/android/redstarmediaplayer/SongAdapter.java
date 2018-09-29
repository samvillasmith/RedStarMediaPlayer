package com.example.android.redstarmediaplayer;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private int mSongsResourceId;


    public SongAdapter(Context context, ArrayList<Song> words, int songResourceId) {
        super(context, 0, words);
        mSongsResourceId = songResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        titleTextView.setText(currentSong.getTrackInfo());


        TextView secondTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        secondTextView.setText(currentSong.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentSong.hasImage()) {
            imageView.setImageResource(currentSong.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mSongsResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}