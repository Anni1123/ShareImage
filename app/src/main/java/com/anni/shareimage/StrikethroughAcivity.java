package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StrikethroughAcivity extends AppCompatActivity {

    TextView strike;
    Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strikethrough_acivity);
        strike=findViewById(R.id.striketext);
        change=findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!strike.getPaint().isStrikeThruText()){
                    strike.setPaintFlags(strike.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    strike.setPaintFlags(strike.getPaintFlags() & ~ Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });
    }
}
