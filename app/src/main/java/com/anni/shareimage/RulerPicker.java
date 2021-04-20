package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.kevalpatel2106.rulerpicker.RulerValuePicker;
import com.kevalpatel2106.rulerpicker.RulerValuePickerListener;

public class RulerPicker extends AppCompatActivity {

    RulerValuePicker rulerValuePicker;
    TextView value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruler_picker);
        rulerValuePicker=findViewById(R.id.ruler_picker);
        value=findViewById(R.id.value);
        rulerValuePicker.selectValue(50);
        rulerValuePicker.setValuePickerListener(new RulerValuePickerListener() {
            @Override
            public void onValueChange(final int selectedValue) {
                //Value changed and the user stopped scrolling the ruler.
                //Application can consider this value as final selected value.
                value.setText("Selected Value is " +selectedValue);
            }

            @Override
            public void onIntermediateValueChange(final int selectedValue) {
                //Value changed but the user is still scrolling the ruler.
                //This value is not final value. Application can utilize this value to display the current selected value.
                value.setText("Selected Value is " +selectedValue);
            }
        });
    }
}
