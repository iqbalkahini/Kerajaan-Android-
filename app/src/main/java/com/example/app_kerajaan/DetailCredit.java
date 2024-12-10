package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailCredit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_credit);

        ImageView back = findViewById(R.id.imageView34);

        back.setOnClickListener(V -> {
            startActivity(new Intent(DetailCredit.this, Menu.class));
        });
    }
}
