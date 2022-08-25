package com.example.davossounbbox;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*----MES BOUTONS D'ACTIONS----*/
        Button btn_rire_klauss = (Button) findViewById(R.id.btn_rire_klauss);
        Button btn_nofear = (Button) findViewById(R.id.btn_nofear);
        Button btn_klaussrobot = (Button) findViewById(R.id.btn_klaussrobot);
        Button btnklaussenfer = (Button) findViewById(R.id.btn_klaussenfer);
        Button btn_ya = (Button) findViewById((R.id.btn_ya));
        Button btn_hmmm = (Button) findViewById(R.id.btn_hmmm);

        btn_rire_klauss.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                playSound(R.raw.rireklauss);
            }
        });

        btn_nofear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                playSound(R.raw.rienacacher);
            }
        });
        btn_klaussrobot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                playSound(R.raw.klaussrobot);
            }
        });
        btnklaussenfer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                playSound(R.raw.rireklaussenfer);
            }
        });
        btn_ya.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                playSound(R.raw.ya);
            }
        });
        btn_hmmm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                playSound(R.raw.gourmand);
            }
        });
    }

    private void playSound(int rawName) {
        if(mPlayer != null)
        {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer = MediaPlayer.create(this, rawName);
        mPlayer.start();
    }

    public void onpause()
    {
        super.onPause();
        if(mPlayer != null)
        {
            mPlayer.stop();
            mPlayer.release();
        }
    }
}
