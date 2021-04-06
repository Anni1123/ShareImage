package com.anni.shareimage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import tyrantgit.explosionfield.ExplosionField;

public class Explosionactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explosionactivity);
        final ImageView explode=findViewById(R.id.explode);
        final ExplosionField explosionField=ExplosionField.attach2Window(this);
        explode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explosionField.explode(explode);
            }
        });
    }
}
