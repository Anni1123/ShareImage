package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SelectText extends AppCompatActivity {
    TextView select;
    EditText selecte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_text);
        select=findViewById(R.id.select);
        selecte=findViewById(R.id.selecte);
        select.setTextIsSelectable(true);

        selecte.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
               selecte.setCursorVisible(true);
               Toast.makeText(SelectText.this,"Visible",Toast.LENGTH_LONG).show();
               return false;
            }
        });
    }
}