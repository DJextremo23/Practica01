package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {
    GridView gridViewImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla2);
        gridViewImage = findViewById(R.id.grid_view_image);
        gridViewImage.setAdapter(new image(this));
    }
}