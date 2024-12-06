package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMataram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_mataram);

        ImageView back = findViewById(R.id.imageView17);
        ImageView next = findViewById(R.id.imageView30);

        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailMataram.this, Menu.class));
        });
        next.setOnClickListener(V -> {
            startActivity(new Intent(DetailMataram.this, prasasti_mataram.class));
        });
    }
}