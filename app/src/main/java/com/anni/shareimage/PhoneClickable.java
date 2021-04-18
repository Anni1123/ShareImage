package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class PhoneClickable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_clickable);
        TextView mobile = (TextView) findViewById(R.id.mobile);
        TextView google = (TextView) findViewById(R.id.google);
        TextView email = (TextView) findViewById(R.id.email);
        email.setText("kumarianni1213@gmail.com");
        mobile.setText("+919065239713");
        google.setText("www.google.com");
        Linkify.addLinks(email, Linkify.ALL);
        Linkify.addLinks(mobile, Linkify.ALL);
        Linkify.addLinks(google, Linkify.ALL);
    }
}
