package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pluscubed.recyclerfastscroll.RecyclerFastScroller;
import com.stone.vega.library.VegaLayoutManager;

public class AllItemsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerFastScroller fastScroller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_items);
        recyclerView=findViewById(R.id.rcv);
        sdfghjkl;
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setLayoutManager(new VegaLayoutManager());
        recyclerView.setAdapter(new RecyclerViewAdapter(50));
        fastScroller=findViewById(R.id.fasttrcv);
        fastScroller.attachRecyclerView(recyclerView);
    }
}
