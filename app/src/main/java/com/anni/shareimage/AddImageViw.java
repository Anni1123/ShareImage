package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class AddImageViw extends AppCompatActivity {

    Button addview;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_image_viw);
        addview=findViewById(R.id.addiview);
        layout=findViewById(R.id.layout);
        addview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView=new ImageView(AddImageViw.this);
                imageView.setImageResource(R.mipmap.ic_launcher);
                addvieW(imageView,200,200);
                colorrandom(imageView);
            }
        });
    }
    public void colorrandom(ImageView imageView){
        Random random=new Random();
        int color= Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
        imageView.setBackgroundColor(color);
    }

    private void addvieW(ImageView imageView, int width, int height) {
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(width,height);
        params.setMargins(0,10,0,10);
        imageView.setLayoutParams(params);
        layout.addView(imageView);
    }
}
