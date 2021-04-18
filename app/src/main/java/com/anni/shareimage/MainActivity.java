package com.anni.shareimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import android.widget.Button;
import android.widget.ImageView;

import com.santalu.maskara.widget.MaskEditText;

import java.io.File;
import java.io.FileOutputStream;


public class MainActivity extends AppCompatActivity {

   Button share;
   ImageView imageView;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       TextView text=findViewById(R.id.click);
       TextView select=findViewById(R.id.select);
       TextView html=findViewById(R.id.html);
       TextView wave=findViewById(R.id.wave);
       TextView zoom=findViewById(R.id.zoom);
       TextView gravity=findViewById(R.id.gravity);
       TextView pattern=findViewById(R.id.pattern);
       TextView zooms=findViewById(R.id.zooms);
       TextView avoid=findViewById(R.id.avoidurl);
       TextView explode=findViewById(R.id.explode);
       TextView selectt=findViewById(R.id.selectt);
       TextView full=findViewById(R.id.full);
       TextView copy=findViewById(R.id.copy);
       TextView animation=findViewById(R.id.animation);
       TextView blink=findViewById(R.id.blink);
       TextView click=findViewById(R.id.clickable);
       TextView addimageview=findViewById(R.id.addimageview);
       TextView viewgif=findViewById(R.id.viewgif);
       TextView flip=findViewById(R.id.flip);
       TextView addb=findViewById(R.id.addb);
       TextView bright=findViewById(R.id.bright);
       TextView web=findViewById(R.id.web);
       TextView dynamic=findViewById(R.id.dynamic);
       TextView superbottom=findViewById(R.id.superbottom);
       TextView lotiebar=findViewById(R.id.lotiebar);
       TextView phone=findViewById(R.id.phone);
       TextView maskedit=findViewById(R.id.maskedit);
       TextView selecti=findViewById(R.id.selecti);
       TextView tclickable=findViewById(R.id.tclickable);
       dynamic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,DynamicActivity.class));
           }
       });
       web.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ViewWeb.class));
           }
       });
       phone.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,PhoneandEmailActivity.class));
           }
       });
       selecti.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,SelectImage.class));
           }
       });
       tclickable.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,PhoneClickable.class));
           }
       });
       maskedit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, MaskEditTextActivity.class));
           }
       });
       lotiebar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ContextualMenu.class));
           }
       });
       superbottom.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,SuperBotttomBar.class));
           }
       });
       text.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ExpandableNewsActivity.class));
           }
       });
       select.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,AllItemsActivity.class));
           }
       });
       wave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,WaveLoadingView.class));
           }
       });
       html.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,HtmlTextView.class));
           }
       });
       zoom.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ZoomTextView.class));
           }
       });
       gravity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,GravityViewActivity.class));
           }
       });
       pattern.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,PatternLockV.class));
           }
       });
       zooms.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ZoomScrollView.class));
           }
       });
       avoid.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, AddUrl.class));
           }
       });
       selectt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, SelectText.class));
           }
       });
       explode.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, Explosionactivity.class));
           }
       });
       full.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, FullScreem.class));
           }
       });
       click.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, Clickable.class));
           }
       });
       copy.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, CopyText.class));
           }
       });
       animation.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, TypingAnimation.class));
           }
       });
       blink.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, BlinkEffect.class));
           }
       });
       addimageview.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, AddImageViw.class));
           }
       });
       viewgif.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, ViewGif.class));
           }
       });
       flip.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, RotateCoin.class));
           }
       });
       bright.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, Brightness.class));
           }
       });
       addb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, AddButton.class));
           }
       });
       //initialising text field where we will enter data

//       share=findViewById(R.id.share);
//       imageView=findViewById(R.id.shareimage);
//       share.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               //Now share image function will be called
//               //here we  will be passing the text to share
////                Getting drawbale value from iamge
//               BitmapDrawable bitmapDrawable=(BitmapDrawable)imageView.getDrawable();
//               Bitmap bitmap=bitmapDrawable.getBitmap();
//               shareImageandText(bitmap);
//           }
//       });

   }
   private void shareImageandText(Bitmap bitmap) {
       Uri uri=getmageToShare(bitmap);
       Intent intent=new Intent(Intent.ACTION_SEND);
       //putting uri of image to be shared
       intent.putExtra(Intent.EXTRA_STREAM,uri);
       //adding text to share
       intent.putExtra(Intent.EXTRA_TEXT,"Sharing Image");
       //Add subject Here
       intent.putExtra(Intent.EXTRA_SUBJECT,"Subject Here");
       //setting type to image
       intent.setType("image/png");
       //calling startactivity to share
       startActivity(Intent.createChooser(intent,"Share Via"));
   }
   //Retrieving the url to share
   private Uri getmageToShare(Bitmap bitmap) {
       File imagefolder=new File(getCacheDir(),"images");
       Uri uri=null;
       try {
           imagefolder.mkdirs();
           File file=new File(imagefolder,"shared_image.png");
           FileOutputStream outputStream=new FileOutputStream(file);
           bitmap.compress(Bitmap.CompressFormat.PNG,90,outputStream);
           outputStream.flush();
           outputStream.close();
           uri= FileProvider.getUriForFile(this,"com.anni.shareimage.fileprovider",file);
       }
       catch (Exception e){

           Toast.makeText(this,""+e.getMessage(),Toast.LENGTH_LONG).show();
       }
       return uri;
   }
}


// For sharing text file  //////////////////////////////




// import androidx.appcompat.app.AppCompatActivity;

// import android.content.Intent;
// import android.os.Bundle;
// import android.widget.EditText;

// public class MainActivity extends AppCompatActivity {

//     EditText gettext;
//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);
//         gettext=findViewById(R.id.gettext);
//       //intantiating the intent 
//         Intent intent = getIntent();
//         String action=intent.getAction();
//       //getting type of content shared
//         String type=intent.getType();
//       //if value is not null then show the content
//         if(Intent.ACTION_SEND.equals(action) && type!=null){
//                 handlesendText(intent);
//         }
//     }

//     private void handlesendText(Intent intent) {
//       //here we are getting the text 
//         String sharedText=intent.getStringExtra(Intent.EXTRA_TEXT);
//         if(sharedText!=null){
//           //showing the text in edittext
//             gettext.setText(sharedText);
//         }
//     }
// }




/////////////////////////////////// end here ///////////////////////////////////////////////


// public class MainActivity extends AppCompatActivity {

//     private SpaceNavigationView spaceNavigationView;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);

//         Toast.makeText(getApplicationContext(), "Long press center button to show badge example", Toast.LENGTH_LONG).show();

//         spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
//         CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) spaceNavigationView.getLayoutParams();
//         layoutParams.setBehavior(new ScrollHandler());
//         spaceNavigationView.initWithSaveInstanceState(savedInstanceState);


//         spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.ic_collections_black_24dp));
//         spaceNavigationView.addSpaceItem(new SpaceItem("SEARCH", R.drawable.ic_collections_black_24dp));
//         spaceNavigationView.shouldShowFullBadgeText(true);
//         spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);



//         spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
//             @Override
//             public void onCentreButtonClick() {
// //                Log.d("onCentreButtonClick ", "onCentreButtonClick");
//                 spaceNavigationView.shouldShowFullBadgeText(true);
// //                BottomNavigationDrawerFragment bottomNavDrawerFragment = new BottomNavigationDrawerFragment();
// //                bottomNavDrawerFragment.show(MainActivity.this.getSupportFragmentManager(), bottomNavDrawerFragment.getTag());
//             }

//             @Override
//             public void onItemClick(int itemIndex, String itemName) {
//                 Log.d("onItemClick ", "" + itemIndex + " " + itemName);
//             }

//             @Override
//             public void onItemReselected(int itemIndex, String itemName) {
//                 Log.d("onItemReselected ", "" + itemIndex + " " + itemName);
//             }
//         });

//         spaceNavigationView.setSpaceOnLongClickListener(new SpaceOnLongClickListener() {
//             @Override
//             public void onCentreButtonLongClick() {
//                 Toast.makeText(MainActivity.this, "onCentreButtonLongClick", Toast.LENGTH_SHORT).show();
//                 Intent intent = new Intent(MainActivity.this, MainActivity.class);
//                 startActivity(intent);
//             }

//             @Override
//             public void onItemLongClick(int itemIndex, String itemName) {
//                 Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
//             }
//         });



//         setUpRecyclerView();
//     }

//     @Override
//     protected void onSaveInstanceState(Bundle outState) {
//         super.onSaveInstanceState(outState);
//         spaceNavigationView.onSaveInstanceState(outState);
//     }

//     private void setUpRecyclerView() {
//         RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//         RecyclerAdapter adapter = new RecyclerAdapter(dummyStrings());
//         recyclerView.setHasFixedSize(true);
//         recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
//         recyclerView.setAdapter(adapter);
//         adapter.setRecyclerClickListener(new RecyclerAdapter.RecyclerClickListener() {
//             @Override
//             public void onClick(int position) {
//                 if (position == 0) {
//                     spaceNavigationView.showBadgeAtIndex(1, 54, ContextCompat.getColor(MainActivity.this, R.color.badge_background_color));
//                 } else if (position == 1) {
//                     spaceNavigationView.hideBudgeAtIndex(1);
//                 }
//             }
//         });
//     }

//     private List<String> dummyStrings() {
//         List<String> colorList = new ArrayList<>();
//         colorList.add("#354045");
//         colorList.add("#20995E");
//         colorList.add("#76FF03");
//         colorList.add("#E26D1B");
//         colorList.add("#911717");
//         colorList.add("#9C27B0");
//         colorList.add("#20995E");
//         colorList.add("#76FF03");
//         colorList.add("#20995E");
//         colorList.add("#76FF03");
//         colorList.add("#E26D1B");
//         colorList.add("#911717");
//         colorList.add("#9C27B0");
//         colorList.add("#20995E");
//         colorList.add("#76FF03");
//         colorList.add("#E26D1B");
//         colorList.add("#911717");
//         colorList.add("#9C27B0");
//         colorList.add("#FFC107");
//         colorList.add("#01579B");
//         return colorList;
//     }
// }
