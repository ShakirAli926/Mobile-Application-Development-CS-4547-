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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        runTimer();
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