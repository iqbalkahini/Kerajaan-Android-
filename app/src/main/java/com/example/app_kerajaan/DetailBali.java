package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailBali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_bali);

        ImageView back = findViewById(R.id.imageView17);
        ImageView next = findViewById(R.id.imageView33);

        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailBali.this, Menu.class));
        });
       next.setOnClickListener(V -> {
           startActivity(new Intent(DetailBali.this, prasasti_bali.class));
       });
    }
}