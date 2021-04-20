package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.circulardialog.CDialog;
import com.example.circulardialog.extras.CDConstants;

public class CircularDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_dialog);
        Button circular=findViewById(R.id.circular);
        circular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CDialog(CircularDialog.this).createAlert("Geeks For Geeks",
                        CDConstants.SUCCESS,   // Type of dialog
                        CDConstants.LARGE)    //  size of dialog
                        .setAnimation(CDConstants.SCALE_FROM_BOTTOM_TO_TOP)     //  Animation for enter/exit
                        .setDuration(2000)   // in milliseconds
                        .setTextSize(CDConstants.LARGE_TEXT_SIZE)  // CDConstants.LARGE_TEXT_SIZE, CDConstants.NORMAL_TEXT_SIZE
                        .show();
            }
        });

    }
}
