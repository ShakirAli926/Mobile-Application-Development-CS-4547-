package com.example.stopwatchexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

public class StopwatchActivity extends AppCompatActivity {

    private int seconds = 0; // Its a counter
    private boolean running ; // State for the time to check whether the watch is running of not.
    private boolean wasRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if(savedInstanceState !=null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putInt("seconds", seconds);
        saveInstanceState.putBoolean("running", running);
        saveInstanceState.putBoolean("wasRunning", wasRunning);
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }


    @Override
    protected void onResume() {
        super.onResume();
        if(wasRunning){
            running = true;
        }
    }


    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;

    }

    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }



        private void runTimer(){
        final TextView timeView = findViewById(R.id.textTime);
//      Handler , Post method
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int mins = (seconds%3600)/60;
                int secs = seconds % 60;

                String time = String.format(Locale.getDefault(),"%d:%02d:%02d",hours,mins,secs);
                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
//               postDelay, runs this method after some delays (milliseconds).
            }


        });

//



    }
}