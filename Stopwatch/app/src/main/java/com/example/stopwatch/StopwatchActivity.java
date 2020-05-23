package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class StopwatchActivity extends AppCompatActivity {
    private int seconds=0;
    private boolean running;
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if(savedInstanceState!=null){
            seconds=savedInstanceState.getInt("seconds");
            running=savedInstanceState.getBoolean("running");
        }
        runTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle savdInstanceState) {
        super.onSaveInstanceState(savdInstanceState);
        savdInstanceState.putInt("seconds",seconds);
        savdInstanceState.putBoolean("running",running);
        savdInstanceState.putBoolean("wasRunning",wasRunning);
    }
    @Override
    protected void onStop() {
        super.onStop();
        wasRunning=running;
        running=false;
    }
    @Override
    protected void onStart() {
        super.onStart();
        if(wasRunning){
            running=true;
        }
    }
    @Override
    protected  void onResume() {
        super.onResume();
        Log.v("PhrasesActivity1","onResume:Resumed");
        if(wasRunning){
            running=true;
        }
    }
    @Override
    protected  void onPause() {
        super.onPause();
        Log.v("PhrasesActivity2","onPause:Paused");
        wasRunning=running;
        running=false;
    }
    public void onClickStart(View view){
        running=true;
    }
    public void runTimer(){
        final TextView timeView=findViewById(R.id.time_view);
        final Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours=seconds/3600;
                int minutes=(seconds%3600)/60;
                int secs=seconds%60;
                String time=String.format(Locale.getDefault(),"%d:%2d:%02d",hours,minutes,secs);
                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }

    public void onClickStop(View view){
        running=false;
    }
    public void onClickReset(View view){
        running=false;
        seconds=0;
    }
}
