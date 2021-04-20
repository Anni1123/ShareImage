package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kofigyan.stateprogressbar.StateProgressBar;

public class StateProgress extends AppCompatActivity {

    String[] descriptionData = {"Development", "Coding", "Placement", "Job"};

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_progress);
        button=findViewById(R.id.button);

        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (stateProgressBar.getCurrentStateNumber()){
                    case 1:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
                        break;
                    case 2:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
                        break;
                    case 3:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);
                        break;
                    case 4:
                        stateProgressBar.setAllStatesCompleted(true);
                        break;
                }
            }
        });
    }
}
