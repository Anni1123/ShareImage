package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PhoneandEmailActivity extends AppCompatActivity {

    TextView textView,getTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phoneand_email);
        textView=findViewById(R.id.textphone);
        getTextView=findViewById(R.id.textemail);
    }
}
