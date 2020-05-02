package com.ceaca.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){

            public  void onTick(long millisecondsUtilsDone){
               //Countdown is counting down(every second)
                Log.i("Seconds left", String.valueOf(millisecondsUtilsDone/1000));
            }
            public void onFinish(){
                //Counter is finished!(every 10 seconds)
                Log.i("Done!","Countdown Timer Finished");
            }
        }.start();
//        //controls timing of certain methods
//        final Handler handler = new Handler();
//        Runnable runnable = new Runnable(){
//            @Override
//            public void run() {
//                Log.i("Runnable has run!","a second must have passed");
//               handler.postDelayed(this,1000);
//            }
//        };
//        handler.post(runnable);
    }

}
