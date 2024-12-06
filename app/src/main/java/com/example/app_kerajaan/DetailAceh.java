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

public class DetailAceh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_aceh);

        ImageView back = findViewById(R.id.imageView17);
        ImageView next = findViewById(R.id.imageView18);

        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailAceh.this, Menu.class));
        });
        next.setOnClickListener(V -> {
            startActivity(new Intent(DetailAceh.this, prasasti_aceh.class));
        });
    }
}