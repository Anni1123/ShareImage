package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.tonnyl.whatsnew.WhatsNew;
import io.github.tonnyl.whatsnew.item.WhatsNewItem;
import io.github.tonnyl.whatsnew.util.PresentationOption;

public class WhataNewL extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whata_new_l);
        button=findViewById(R.id.whatsnew);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WhatsNew whatsNew=WhatsNew.newInstance(
                        new WhatsNewItem("Firebase Authentication", "Firebase Authentication service provides easy to use UI libraries and SDKs to authenticate users to your app.", R.drawable.circle),
                        new WhatsNewItem("Firebase Realtime Database", "The Firebase Realtime Database is a cloud based NoSQL database ", R.drawable.circle),
                        new WhatsNewItem("Cloud Firestore", " The cloud Firestore is a NoSQL document database that provides services like store, sync, and query through the application on a global scale", R.drawable.circle),
                        new WhatsNewItem("Firebase", " irebase is a product of Google which helps developers to build, manage, and grow their apps easily. It helps developers to build their apps faster and in a more secure way.", WhatsNewItem.NO_IMAGE_RES_ID)
                );
                whatsNew.setPresentationOption(PresentationOption.DEBUG);
                whatsNew.presentAutomatically(WhataNewL.this);
            }
        });

    }
}
