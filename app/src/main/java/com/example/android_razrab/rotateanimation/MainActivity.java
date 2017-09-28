package com.example.android_razrab.rotateanimation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import static android.R.attr.animationDuration;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView)findViewById(R.id.iv);

        RotateAnimation rotateAnimation=new RotateAnimation(0,360,0.5f,0.5f);


        rotateAnimation.setRepeatCount(5);
        rotateAnimation.setDuration(2000);

        imageView.startAnimation(rotateAnimation);

    }
}
