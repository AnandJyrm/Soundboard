package com.anandj.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer sounds[] = new MediaPlayer[12];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sounds[0] = MediaPlayer.create(this, R.raw.applause);
        sounds[1] = MediaPlayer.create(this, R.raw.cricket);
        sounds[2] = MediaPlayer.create(this, R.raw.crybaby);
        sounds[3] = MediaPlayer.create(this, R.raw.waow);
        sounds[4] = MediaPlayer.create(this, R.raw.wobow);
        sounds[5] = MediaPlayer.create(this, R.raw.dingdingding);
        sounds[6] = MediaPlayer.create(this, R.raw.disastah);
        sounds[7] = MediaPlayer.create(this, R.raw.inception);
        sounds[8] = MediaPlayer.create(this, R.raw.drumroll);
        sounds[9] = MediaPlayer.create(this, R.raw.frog);
        sounds[10] = MediaPlayer.create(this, R.raw.meepmorp);
        sounds[11] = MediaPlayer.create(this, R.raw.trombone);

    }

    public void sound1(View view) {
        sounds[1].start();
    }

    public void sound2(View view) {
        sounds[7].start();
    }

    public void sound3(View view) {
        sounds[10].start();
    }

    public void sound4(View view) {
        sounds[0].start();
    }

    public void sound5(View view) {
        sounds[2].start();
    }

    public void sound6(View view) {
        sounds[6].start();
    }

    public void sound7(View view) {
        sounds[3].start();
    }

    public void sound8(View view) {
        sounds[8].start();
    }

    public void sound9(View view) {
        sounds[9].start();
    }

    public void sound10(View view) {
        sounds[4].start();
    }

    public void sound11(View view) {
        sounds[11].start();
    }

    public void sound12(View view) {
        sounds[5].start();
    }
}
