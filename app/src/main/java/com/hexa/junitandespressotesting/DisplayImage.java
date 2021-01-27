package com.hexa.junitandespressotesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DisplayImage extends AppCompatActivity {

    private ImageView iv_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        iv_display = findViewById(R.id.iv_display);

        if(getIntent().getExtras() != null){
            String image = getIntent().getStringExtra("image_url");
            Glide.with(this).load(image).into(iv_display);
        }
    }
}