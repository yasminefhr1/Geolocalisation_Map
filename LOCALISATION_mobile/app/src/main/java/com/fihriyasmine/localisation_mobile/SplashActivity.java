package com.fihriyasmine.localisation_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView earthImage = findViewById(R.id.earthImage);

        // Charger l'animation de rotation
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_earth);
        earthImage.startAnimation(rotateAnimation);

        // Démarrer MapsActivity après 3 secondes
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}
