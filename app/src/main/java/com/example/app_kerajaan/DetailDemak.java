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

public class DetailDemak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_demak);

        ImageView back = findViewById(R.id.imageView17);
        Button next = findViewById(R.id.BA1);
        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailDemak.this, Menu.class));
        });
        next.setOnClickListener(V -> {
            startActivity(new Intent(DetailDemak.this, prasasti_demak.class));
        });
    }
}