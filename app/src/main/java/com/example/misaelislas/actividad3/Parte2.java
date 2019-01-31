package com.example.misaelislas.actividad3;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class Parte2 extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView gestureText;
    private GestureDetectorCompat mDetector;
    float x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText = (TextView) findViewById(R.id.gestureText);
        mDetector = new GestureDetectorCompat(this, this);
        mDetector.setOnDoubleTapListener(this);

            super.onCreate(savedInstanceState);
            setContentView(R.layout.parte2);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //final TextView textView = (TextView) findViewById(R.id.tv1);
       // int color = Integer.parseInt("000000", 16)+0xFF000000;

        //this.mDetector.onTouchEvent(event);
        //textView.setTextColor(color);
        x = event.getX();
        y = event.getY();
        gestureText.setText(" "+x + " "+y);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gestureText.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gestureText.setText("onDoubleTap");
        //final TextView textView = (TextView) findViewById(R.id.tv1);
        //int color2 = Integer.parseInt("ffffff", 16)+0xFF000000;
        //onDoubleTap(e);
        //textView.setTextColor(color2);
        return onDoubleTap(e);
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gestureText.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        gestureText.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gestureText.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gestureText.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gestureText.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gestureText.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        gestureText.setText("onFling");
        return true;
    }



}



