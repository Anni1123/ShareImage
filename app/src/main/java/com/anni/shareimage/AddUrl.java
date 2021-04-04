package com.anni.shareimage;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddUrl extends AppCompatActivity {

    EditText addurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avoid_url);
        addurl=findViewById(R.id.aurl);
        addurl.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(Patterns.WEB_URL.matcher(addurl.getText().toString()).matches()){
                    Toast.makeText(AddUrl.this, "Pattern Matches", Toast.LENGTH_SHORT).show();
                }else{
                    addurl.setError("Invalid Url");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
