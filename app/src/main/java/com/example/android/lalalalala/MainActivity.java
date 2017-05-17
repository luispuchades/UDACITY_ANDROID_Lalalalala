package com.example.android.lalalalala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Capture of buttons to call activities at activity_main.xml
        TextView searchMusicButton = (TextView) findViewById(R.id.search_music);
        TextView playListButton = (TextView) findViewById(R.id.play_list);
        final ImageView frontImageButton = (ImageView) findViewById(R.id.front_image);
        final ImageView lastSongButton = (ImageView) findViewById(R.id.last_song);
        TextView myMusicButton = (TextView) findViewById(R.id.my_music);

        //Action defined if Search Music Button si pushed
        searchMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Define new intent for Search Music activity
                Intent searchMusicActivity = new Intent(MainActivity.this, searchmusic.class);
                //Start new activity
                startActivity(searchMusicActivity);
            }
        });

        //Action defined if PlayList button is pushed
        playListButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Define new intent for Playlist activity
                Intent playlistActivity = new Intent(MainActivity.this, playlist.class);
                //Start new activity
                startActivity(playlistActivity);
            }
        });

        //Action defined if Front Image button is pushed
        frontImageButton.setOnClickListener(new View.OnClickListener(){
            //Events definition
            private void showFrontMessage(String message) {
                for (int i=0; i < 2; i++) {
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                }
            }

            String imageMessage;

            @Override
            public void onClick(View view){
                imageMessage = "\n";
                imageMessage += "\n" + getString(R.string.image_message);
                imageMessage += "\n";
                imageMessage += "\n";
                imageMessage += "\n" + getString(R.string.image_message1);
                imageMessage += "\n";
                imageMessage += "\n";

                //If front image is pushed then last song starts playing
                frontImageButton.setVisibility(View.GONE);
                lastSongButton.setVisibility(View.VISIBLE);
                showFrontMessage(imageMessage);
            }
        });

        //Action defined if Front Image button is pushed
        lastSongButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //If front image is pushed then last song starts playing
                lastSongButton.setVisibility(View.GONE);
                frontImageButton.setVisibility(View.VISIBLE);
            }
        });

        //Action defined if PlayList button is pushed
        myMusicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Define new intent for My Music activity
                Intent myMusicActivity = new Intent(MainActivity.this, mymusic.class);
                //Start new activity
                startActivity(myMusicActivity);
            }
        });
    }
}
