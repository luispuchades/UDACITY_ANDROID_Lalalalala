package com.example.android.lalalalala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_playlist.xml layout file
        setContentView(R.layout.activity_playlist);

        //Capture of buttons to call activities at activity_searchmusic.xml
        TextView searchMusicPlaylistButton = (TextView) findViewById(R.id.searchMusicPlaylist);
        TextView myMusicPlaylistButton = (TextView) findViewById(R.id.myMusicPlaylist);

        //Action defined if playList Button si pushed
        searchMusicPlaylistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent searchMusicActivity = new Intent(playlist.this, searchmusic.class);
                //Define flag to avoid create a new intent if it is already created
                searchMusicActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //Start new activity
                startActivity(searchMusicActivity);
            }
        });

        //Action defined if playList Button si pushed
        myMusicPlaylistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent myMusicActivity = new Intent(playlist.this, mymusic.class);
                //Define flag to avoid create a new intent if it is already created
                myMusicActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //Start new activity
                startActivity(myMusicActivity);
            }
        });
    }
}
