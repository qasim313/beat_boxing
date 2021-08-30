package com.example.chuss_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button beat1,beat2,beat3,beat4,beat5,beat6,beat7,beat8,beat9,beat10,beat11,beat12,beat13,beat14,beat15,beat16;

    int flag = 1 ;
    MediaPlayer mp ;
    MediaPlayer currentPlaying, nextPlay ;
    int a,previousSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void stop (int a){

        if ( flag == 0 ){
            currentPlaying.pause();
            flag = 1;
            if(a!=previousSong){
                mp.start();
                currentPlaying = mp;
                flag = 0;
                previousSong = a ;
            }
        }
        else {
            mp.start();
            currentPlaying = mp;
            flag = 0;
            previousSong =  a ;
        }
    }


    public void beats(View view){
        a = view.getId();


        if(a==R.id.sound1){
            mp = MediaPlayer.create(this, R.raw.the_nights);
            stop(a);
        }
        else if(a==R.id.sound2){
            mp = MediaPlayer.create(this, R.raw.lily);
            stop(a);
        }
        else if(a==R.id.sound3){
            mp = MediaPlayer.create(this, R.raw.alone);
            stop(a);
        }
        else if(a==R.id.sounnd4){
            mp = MediaPlayer.create(this, R.raw.friends);
            stop(a);
        }
        else if(a==R.id.sound5){
            mp = MediaPlayer.create(this, R.raw.on_my_way);
            stop(a);
        }
        else if(a==R.id.sound6){
            mp = MediaPlayer.create(this, R.raw.safari);
            stop(a);
        }
        else if(a==R.id.sound7){
            mp = MediaPlayer.create(this, R.raw.senorita);
            stop(a);
        }
        else if(a==R.id.sound8){
            mp = MediaPlayer.create(this, R.raw.shape_of_you);
            stop(a);
        }
        else{
            Toast.makeText(this, "Something went wrong!" , Toast.LENGTH_SHORT ).show();
        }

    }


}
