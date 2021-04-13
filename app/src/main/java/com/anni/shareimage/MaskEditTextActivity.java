package com.anni.shareimage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.santalu.maskara.widget.MaskEditText;


public class MaskEditTextActivity extends AppCompatActivity {
    private MaskEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mask_edit_text);

        final AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Title")
                .setMessage("Example Message")
                .setPositiveButton("Ok", null)
                .setNegativeButton("Cancel", null)
                .show();

        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MaskEditTextActivity.this, "Not closing", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        editText = findViewById(R.id.edit_text_phone);
    }

    public void showText(View v) {
        Toast.makeText(this, editText.getText(), Toast.LENGTH_SHORT).show();
    }


}