package com.example.misaelislas.actividad3;

import android.app.Activity;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView gestureText;
    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText = (TextView) findViewById(R.id.gestureText);
        this.mDetector = new GestureDetectorCompat(this, this);
        mDetector.setOnDoubleTapListener(this);


        final TextView textView = (TextView) findViewById(R.id.tv1);
        Button button =  (Button) findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Helou");
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.mDetector.onTouchEvent(event);
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
        return true;
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



