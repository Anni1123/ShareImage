package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ExpandableNewsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Data> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_news);
        recyclerView=findViewById(R.id.recyclerView);
        initialiseData();
        setDatainRecycerVieW();
    }
    private void setDatainRecycerVieW() {
        DataAdapter dataAdapter = new DataAdapter(list);
        recyclerView.setAdapter(dataAdapter);
        recyclerView.setHasFixedSize(true);
    }
    private void initialiseData() {
        list=new ArrayList<>();
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
        list.add(new Data("GFG","About","Free Tutorials, Millions of Articles, Live, Online and Classroom Courses ,Frequent Coding Competitions ,Webinars by Industry Experts, Internship opportunities and Job Opportunities."));
    }
}
