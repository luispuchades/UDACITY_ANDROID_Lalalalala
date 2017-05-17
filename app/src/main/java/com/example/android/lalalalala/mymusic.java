package com.example.android.lalalalala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mymusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_mymusic);

        //Capture of buttons to call activities at activity_mymusic.xml
        TextView searchMusicMyMusicButton = (TextView) findViewById(R.id.searchMusicMyMusic);
        TextView playlistMyMusicButton = (TextView) findViewById(R.id.playlistMyMusic);

        //Action defined if playList Button si pushed
        searchMusicMyMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent searchMusicActivity = new Intent(mymusic.this, searchmusic.class);
                //Define flag to avoid create a new intent if it is already created
                searchMusicActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //Start new activity
                startActivity(searchMusicActivity);
            }
        });

        //Action defined if playList Button si pushed
        playlistMyMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent playlistActivity = new Intent(mymusic.this, playlist.class);
                //Define flag to avoid create a new intent if it is already created
                playlistActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //Start new activity
                startActivity(playlistActivity);
            }
        });
    }
}
