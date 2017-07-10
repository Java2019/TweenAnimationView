package com.samples.res.tweenanimationview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenAnimationActivity extends AppCompatActivity
        implements View.OnClickListener{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
        imageView = (ImageView)findViewById(R.id.image);
    }

    @Override
    public void onClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.anim_android);
        imageView.startAnimation(animation);
    }
}
