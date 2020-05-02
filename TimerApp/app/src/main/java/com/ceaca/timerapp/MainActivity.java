package com.ceaca.timerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar timerSeekBar = (SeekBar)findViewById(R.id.timerSeekBar);
        final TextView timerTextView = (TextView)findViewById(R.id.textView);
        timerSeekBar.setMax(600);
        timerSeekBar.setProgress(30);
        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int minutes = (int) progress / 60;
                int seconds = progress - minutes * 60;
                String secondsString = Integer.toString(seconds);
                if(secondsString.equals("0")){
                    Log.i("second string 0",secondsString.toString());
                    secondsString = "00";
                }
                Log.i("second string",secondsString.toString());
                timerTextView.setText(Integer.toString(minutes) + ":" + secondsString);

            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
