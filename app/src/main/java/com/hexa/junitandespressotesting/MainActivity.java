package com.hexa.junitandespressotesting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ImagesAdapter.ItemClickListener {

    private RecyclerView rv_images;
    private ImagesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_images = findViewById(R.id.rv_images);
        rv_images.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ImagesAdapter(this, getData());
        adapter.setClickListener(this);
        rv_images.setAdapter(adapter);

    }

    //data source
    private List<String> getData(){
        List<String> images = new ArrayList<>();

        images.add("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg");
        images.add("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/IMG_67561180x180c6a2.jpg");
        images.add("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/BBQPorkSlider1of115202.jpg");
        images.add("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/596220f796.jpg");
        images.add("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/easyicecreamcake_300d8c35460.jpg");

        return images;
    }

    @Override
    public void onItemClick(View view, int position) {
        openImage(getData().get(position));
    }

    private void openImage(String image_url){
        Intent i = new Intent(this, DisplayImage.class);
        i.putExtra("image_url", image_url);
        startActivity(i);
    }
}