package com.example.chuss_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        sound1 = sound1.findViewById(R.id.sound1);
//        sound1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =
//            }
//        });

         sound1 = (Button) this.findViewById(R.id.sound1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.the_nights);
        sound1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp.isPlaying()){
                    mp.pause();
                } else {mp.start();}
            }
        });
        sound2 = (Button) this.findViewById(R.id.sound2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.lily);
        sound2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                } else {mediaPlayer.start();}
            }
        });
        sound3 = (Button) this.findViewById(R.id.sound3);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.alone);
        sound3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp1.isPlaying()){
                    mp1.pause();
                } else {mp1.start();}
            }
        });
        sound4 = (Button) this.findViewById(R.id.sounnd4);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.friends);
        sound4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp2.isPlaying()){
                    mp2.pause();
                } else {mp2.start();}
            }
        });
        sound5 = (Button) this.findViewById(R.id.sound5);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.on_my_way);
        sound5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp3.isPlaying()){
                    mp3.pause();
                } else {mp3.start();}
            }
        });
        sound6 = (Button) this.findViewById(R.id.sound6);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.safari);
        sound6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp4.isPlaying()){
                    mp4.pause();
                } else {mp4.start();}
            }
        });
        sound7 = (Button) this.findViewById(R.id.sound7);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.senorita);
        sound7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp5.isPlaying()){
                    mp5.pause();
                } else {mp5.start();}
            }
        });
        sound8 = (Button) this.findViewById(R.id.sound8);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.shape_of_you);
        sound8.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (mp6.isPlaying()){
                    mp6.pause();
                } else {mp6.start();}
            }
        });
    }
}
