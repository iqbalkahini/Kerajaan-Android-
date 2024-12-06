package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailBali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_bali);

        ImageView back = findViewById(R.id.imageView17);
        ImageView next = findViewById(R.id.imageView26);

        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailBali.this, Menu.class));
        });
//        next.setOnClickListener(V -> {
//            startActivity(new Intent(DetailBali.this, prasasti_bali.class));
//        });
    }
}