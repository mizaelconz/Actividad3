package com.example.misaelislas.actividad3;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Parte1 extends AppCompatActivity {


    {
        final TextView textView = (TextView) findViewById(R.id.tv1);
        Button b1 = (Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onStart() {
        super.onStart();
        RelativeLayout myLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                handleTouch(motionEvent);
                return false;
            }
        });
    }

    protected void handleTouch(MotionEvent m) {
        final TextView textView = (TextView) findViewById(R.id.tv1);
        textView.setText("" + m.getX() + "," + m.getY());

        int numberOfPointers = m.getPointerCount();
        for (int i = 0; i < numberOfPointers; i++) ;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parte1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


    }
}





