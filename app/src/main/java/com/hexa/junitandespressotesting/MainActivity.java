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

import static com.hexa.junitandespressotesting.ImagesData.getData;

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

    @Override
    public void onItemClick(View view, int position) {
        openImage(getData().get(position));
    }

    private void openImage(int image_src){
        Intent i = new Intent(this, DisplayImage.class);
        i.putExtra("image_src", image_src);
        startActivity(i);
    }
}