package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class FoldingCell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folding_cell);

        final com.ramotion.foldingcell.FoldingCell fc =  findViewById(R.id.folding_cell);
//​
        // attach click listener to folding cell
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });
    }
}
