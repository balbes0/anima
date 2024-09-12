package com.example.anima;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TweenAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.monk_tween_animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.ta_btn_animatiojn);

        ImageView imageView = findViewById(R.id.animationView);

        imageView.startAnimation(animation);


        Button buttonToMain = findViewById(R.id.button_back);

        buttonToMain.startAnimation(animation1);

        buttonToMain.setOnClickListener(v -> {
            Intent intent = new Intent(TweenAnimation.this, MainActivity.class);
            startActivity(intent);
        });
    }
}