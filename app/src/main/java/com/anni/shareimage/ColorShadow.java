package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ViewTarget;

import io.github.armcha.coloredshadow.ShadowImageView;

public class ColorShadow extends AppCompatActivity {

    ShadowImageView imageViewl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_shadow);
        imageViewl=findViewById(R.id.shadowImage);
        Glide.with(ColorShadow.this)
                .load(R.drawable.circle)
                .placeholder(R.drawable.circle).into(imageViewl);
    }
}
