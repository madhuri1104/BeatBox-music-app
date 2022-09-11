package com.example.beatbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    MediaPlayer soundPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }


    public void soundPlayButton(View view){

        Button buttonsOnScreen = (Button) view;
        int tagValue = Integer.parseInt(buttonsOnScreen.getTag().toString());

        playSound(tagValue);

    }




    public void playSound(int tagValueInput){

        if(tagValueInput == 0){

            soundPlay = MediaPlayer.create(this,R.raw.flute);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });







        }else if(tagValueInput == 1){

            soundPlay = MediaPlayer.create(this,R.raw.dhol);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });




        }else if(tagValueInput == 2){

            soundPlay = MediaPlayer.create(this,R.raw.guitar);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });



        }else if(tagValueInput ==3){

            soundPlay = MediaPlayer.create(this,R.raw.harmonica);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });




        } else if(tagValueInput == 4){

            soundPlay = MediaPlayer.create(this,R.raw.piono);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });



        } else if (tagValueInput == 5){

            soundPlay = MediaPlayer.create(this,R.raw.sexaphone);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });



        } else if(tagValueInput ==6){

            soundPlay = MediaPlayer.create(this,R.raw.sitar);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });




        } else if(tagValueInput ==7){

            soundPlay = MediaPlayer.create(this,R.raw.drum);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });





        } else if(tagValueInput == 8){

            soundPlay = MediaPlayer.create(this,R.raw.violene);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });




        }


    }




    @Override
    protected void onStop() {

        releaseAndStop();

        super.onStop();
    }


    public void releaseAndStop(){

        if(soundPlay != null){

            soundPlay.stop();
            soundPlay.release();


        }







    }



}