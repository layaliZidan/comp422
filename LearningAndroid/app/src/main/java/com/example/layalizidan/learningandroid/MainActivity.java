package com.example.layalizidan.learningandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {
    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        start.setOnClickListener(this);// assigning click listener to the button
        stop.setOnClickListener(this); // assigning click listener to the button
    }

    /**
     * @params v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                startService(new Intent(getApplication(),HeadAct.class)); // starting the service
                this.finish();
                break;
            case R.id.stop:
                stopService(new Intent(getApplication(),HeadAct.class)); // stopping the service
                break;
        }
    }
}
