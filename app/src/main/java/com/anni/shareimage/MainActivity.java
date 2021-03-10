package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Toast;

import android.widget.Button;
import android.widget.ImageView;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.luseen.spacenavigation.SpaceOnLongClickListener;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;


//public class MainActivity extends AppCompatActivity {

//    Button share;
//    ImageView imageView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        share=findViewById(R.id.share);
//        imageView=findViewById(R.id.shareimage);
//        //initialising text field where we will enter data
//        share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Now share image function will be called
//                //here we  will be passing the text to share
////                Getting drawbale value from iamge
//                BitmapDrawable bitmapDrawable=(BitmapDrawable)imageView.getDrawable();
//                Bitmap bitmap=bitmapDrawable.getBitmap();
//                shareImageandText(bitmap);
//            }
//        });
//
//    }
//    private void shareImageandText(Bitmap bitmap) {
//        Uri uri=getmageToShare(bitmap);
//        Intent intent=new Intent(Intent.ACTION_SEND);
//        //putting uri of image to be shared
//        intent.putExtra(Intent.EXTRA_STREAM,uri);
//        //adding text to share
//        intent.putExtra(Intent.EXTRA_TEXT,"Sharing Image");
//        //Add subject Here
//        intent.putExtra(Intent.EXTRA_SUBJECT,"Subject Here");
//        //setting type to image
//        intent.setType("image/png");
//        //calling startactivity to share
//        startActivity(Intent.createChooser(intent,"Share Via"));
//    }
//    //Retrieving the url to share
//    private Uri getmageToShare(Bitmap bitmap) {
//        File imagefolder=new File(getCacheDir(),"images");
//        Uri uri=null;
//        try {
//            imagefolder.mkdirs();
//            File file=new File(imagefolder,"shared_image.png");
//            FileOutputStream outputStream=new FileOutputStream(file);
//            bitmap.compress(Bitmap.CompressFormat.PNG,90,outputStream);
//            outputStream.flush();
//            outputStream.close();
//            uri= FileProvider.getUriForFile(this,"com.anni.shareimage.fileprovider",file);
//        }
//        catch (Exception e){
//
//            Toast.makeText(this,""+e.getMessage(),Toast.LENGTH_LONG).show();
//        }
//        return uri;
//    }
//}



public class MainActivity extends AppCompatActivity {

    private SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "Long press center button to show badge example", Toast.LENGTH_LONG).show();

        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) spaceNavigationView.getLayoutParams();
        layoutParams.setBehavior(new ScrollHandler());
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);


        spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.ic_collections_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("SEARCH", R.drawable.ic_collections_black_24dp));
        spaceNavigationView.shouldShowFullBadgeText(true);
        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);



        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
//                Log.d("onCentreButtonClick ", "onCentreButtonClick");
                spaceNavigationView.shouldShowFullBadgeText(true);
//                BottomNavigationDrawerFragment bottomNavDrawerFragment = new BottomNavigationDrawerFragment();
//                bottomNavDrawerFragment.show(MainActivity.this.getSupportFragmentManager(), bottomNavDrawerFragment.getTag());
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Log.d("onItemClick ", "" + itemIndex + " " + itemName);
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Log.d("onItemReselected ", "" + itemIndex + " " + itemName);
            }
        });

        spaceNavigationView.setSpaceOnLongClickListener(new SpaceOnLongClickListener() {
            @Override
            public void onCentreButtonLongClick() {
                Toast.makeText(MainActivity.this, "onCentreButtonLongClick", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onItemLongClick(int itemIndex, String itemName) {
                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });



        setUpRecyclerView();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        spaceNavigationView.onSaveInstanceState(outState);
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(dummyStrings());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(adapter);
        adapter.setRecyclerClickListener(new RecyclerAdapter.RecyclerClickListener() {
            @Override
            public void onClick(int position) {
                if (position == 0) {
                    spaceNavigationView.showBadgeAtIndex(1, 54, ContextCompat.getColor(MainActivity.this, R.color.badge_background_color));
                } else if (position == 1) {
                    spaceNavigationView.hideBudgeAtIndex(1);
                }
            }
        });
    }

    private List<String> dummyStrings() {
        List<String> colorList = new ArrayList<>();
        colorList.add("#354045");
        colorList.add("#20995E");
        colorList.add("#76FF03");
        colorList.add("#E26D1B");
        colorList.add("#911717");
        colorList.add("#9C27B0");
        colorList.add("#20995E");
        colorList.add("#76FF03");
        colorList.add("#20995E");
        colorList.add("#76FF03");
        colorList.add("#E26D1B");
        colorList.add("#911717");
        colorList.add("#9C27B0");
        colorList.add("#20995E");
        colorList.add("#76FF03");
        colorList.add("#E26D1B");
        colorList.add("#911717");
        colorList.add("#9C27B0");
        colorList.add("#FFC107");
        colorList.add("#01579B");
        return colorList;
    }
}