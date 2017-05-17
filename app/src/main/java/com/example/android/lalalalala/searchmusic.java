package com.example.android.lalalalala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class searchmusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_searchmusic);

        //Capture of buttons to call activities at activity_mymusic.xml
        TextView playlistSearchButton = (TextView) findViewById(R.id.playListSearchMusic);
        TextView myMusicSearchButton = (TextView) findViewById(R.id.myMusicSearchMusic);

        //Action defined if playList Button si pushed
        playlistSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent playlistActivity = new Intent(searchmusic.this, playlist.class);
                //Define flag to avoid create a new intent if it is already created
                playlistActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //Start new activity
                startActivity(playlistActivity);
            }
        });

        //Action defined if playList Button si pushed
        myMusicSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent myMusicActivity = new Intent(searchmusic.this, mymusic.class);
                //Define flag to avoid create a new intent if it is already created
                myMusicActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //Start new activity
                startActivity(myMusicActivity);
            }
        });
    }
}
