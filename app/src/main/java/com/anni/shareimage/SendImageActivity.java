package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SendImageActivity extends AppCompatActivity {

    Button sendimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_image);
        sendimage=findViewById(R.id.sendimagei);
        sendimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendimage=new Intent(SendImageActivity.this,ReceieveImage.class);
                sendimage.putExtra("image",R.drawable.circle);
                startActivity(sendimage);
            }
        });
    }
}
