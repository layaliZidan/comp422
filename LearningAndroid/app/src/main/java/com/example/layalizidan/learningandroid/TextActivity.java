package com.example.layalizidan.learningandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TextActivity extends Activity {

    public  Context mContext;
    Button close;
    Button read;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.content_text);




    }
    public void onPause(){
        super.onPause();
    }


    public  Context getContext() {
        return mContext;
    }

    public void btn_back_onClick(View view) {
      //  Toast.makeText(this, "tapped", Toast.LENGTH_SHORT).show();

        final Context context = this;

        //close = (Button) findViewById(R.id.btn_back);

       close.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View v, MotionEvent event) {
              // Intent intent = new Intent(context, TextActivity.class);
             //  startActivity(intent);
               finish();
               return false;
           }

        });
    }
}
