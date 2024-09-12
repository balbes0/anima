package com.example.anima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToFA = findViewById(R.id.button_to_frame_animation);
        Button buttonToTA = findViewById(R.id.button_to_tween_animation);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.main_animation);
        buttonToFA.startAnimation(animation);
        buttonToTA.startAnimation(animation);

        buttonToFA.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameAnimation.class);
            startActivity(intent);
        });

        buttonToTA.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TweenAnimation.class);
            startActivity(intent);
        });
    }
}
