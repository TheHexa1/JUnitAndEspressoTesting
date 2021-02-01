package com.hexa.junitandespressotesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DisplayImage extends AppCompatActivity {

    private ImageView iv_display;
    private TextView tv_image_title;
    private int image_src;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        iv_display = findViewById(R.id.iv_display);
        tv_image_title = findViewById(R.id.tv_image_title);

        if(getIntent().getExtras() != null){
            image_src = getIntent().getIntExtra("image_src", R.drawable.cake);
            Glide.with(this).load(image_src).into(iv_display);
        }

        tv_image_title.setText(getResources().getResourceEntryName(image_src));
    }
}