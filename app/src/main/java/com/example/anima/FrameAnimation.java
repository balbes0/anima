package com.example.anima;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView img = findViewById(R.id.animationView);
        Button buttonToMain = findViewById(R.id.button_back);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_fa);

        img.startAnimation(fadeInAnimation);
        buttonToMain.startAnimation(fadeInAnimation);

        img.setBackgroundResource(R.drawable.monke_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

        img.setOnClickListener(view -> {
            frameAnimation.start();
        });

        buttonToMain.setOnClickListener(v -> {
            Intent intent = new Intent(FrameAnimation.this, MainActivity.class);
            startActivity(intent);
        });


    }
}