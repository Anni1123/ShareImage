package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TypingAnimation extends AppCompatActivity {
    TextView typingt;
    Button typingb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typing_animation);
        typingb=findViewById(R.id.typingb);
        typingt=findViewById(R.id.typingt);
        typingb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.setText("G");
                    }
                },300);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },500);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("k");
                    }
                },600);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("s");
                    }
                },700);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("f");
                    }
                },800);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("o");
                    }
                },900);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("r");
                    }
                },1000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("G");
                    }
                },1100);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },1200);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("e");
                    }
                },1300);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("k");
                    }
                },1400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        typingt.append("s");
                    }
                },1500);
            }
        });
    }
}
