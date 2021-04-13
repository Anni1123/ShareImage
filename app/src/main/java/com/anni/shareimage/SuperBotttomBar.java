package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import me.ertugrul.lib.OnItemReselectedListener;
import me.ertugrul.lib.OnItemSelectedListener;
import me.ertugrul.lib.SuperBottomBar;

public class SuperBotttomBar extends AppCompatActivity {
    SuperBottomBar botttomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_botttom_bar);
        botttomBar=findViewById(R.id.bottomBar);
        botttomBar.setOnItemSelectListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelect(int i) {
                Toast.makeText(SuperBotttomBar.this,"Selected",Toast.LENGTH_LONG).show();
            }
        });
        botttomBar.setOnItemReselectListener(new OnItemReselectedListener() {
            @Override
            public void onItemReselect(int i) {
                Toast.makeText(SuperBotttomBar.this,"Reselected",Toast.LENGTH_LONG).show();
            }
        });
    }
}
