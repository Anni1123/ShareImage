package com.anni.shareimage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class DataAdapter extends RecyclerView.Adapter {
    public DataAdapter(List<Data> list) {
        this.list = list;
    }

    List<Data> list;
    int previousItem=-1;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {
        final String text=list.get(position).getName();
        final String title=list.get(position).getTitle();
        final String description=list.get(position).getDecription();
        final boolean expand=list.get(position).isExpandable();
        ((MyHolder)holder).description.setText(description);
        ((MyHolder)holder).name.setText(text);
        ((MyHolder)holder).title.setText(title);
        ((MyHolder)holder).relative.setVisibility(expand?View.VISIBLE:View.GONE);
        ((MyHolder)holder).linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(expand){
                    ((MyHolder)holder).relative.setVisibility(View.GONE);
                }else {
                    ((MyHolder)holder).relative.setVisibility(View.VISIBLE);
                }
            }
        });

        ((MyHolder)holder).relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MyHolder)holder).relative.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyHolder extends RecyclerView.ViewHolder{
        LinearLayout linear;
        RelativeLayout relative;
        TextView name,title,description;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            linear=itemView.findViewById(R.id.linear);
            relative=itemView.findViewById(R.id.relative);
        }
    }
}