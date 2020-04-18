package com.database.imagesave;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button butt;
    OutputStream outputStream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView)findViewById(R.id.imagesee);
        butt=(Button)findViewById(R.id.save);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                BitmapDrawable drawable=(BitmapDrawable) image.getDrawable();
//                Bitmap bitmap= drawable.getBitmap();
//                File filepath= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
//                File directry=new File(filepath.getAbsolutePath()+"/Demo/");
//                directry.mkdir();
//                File file=new File(directry,System.currentTimeMillis()+".jpg");
//                try {
//                    outputStream = new FileOutputStream(file);
//                }catch (FileNotFoundException e)
//                {
//                    e.printStackTrace();
//                }
//               // bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream);
//                Toast.makeText(MainActivity.this, "image saved", Toast.LENGTH_SHORT).show();
//                try{outputStream.flush();}
//                catch (IOException r)
//                {
//                    r.printStackTrace();
//                }
//                try {
//                    outputStream.close();
//                }
//                catch (IOException h)
//                {
//                    h.printStackTrace();
//                }
                //image.setImageResource(R.drawable.images);//to change the image after button is clicked

                image.animate().translationYBy(500f);//.setDuration(2000);
//                image.setImageResource(R.drawable.images);
//                image.animate().alpha(1f).setDuration(2000);
image.animate().alpha(0f);
            }
        });

    }
}