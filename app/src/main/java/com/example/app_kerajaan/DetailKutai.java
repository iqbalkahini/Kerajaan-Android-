package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailKutai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_kutai);

        ImageView back = findViewById(R.id.imageView17);
        ImageView next = findViewById(R.id.imageView28);
        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailKutai.this, Menu.class));
        });
        next.setOnClickListener(V -> {
            startActivity(new Intent(DetailKutai.this, prasasti_kutai.class));
        });
    }
}