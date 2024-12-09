package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class prasasti_kutai extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prasasti_peninggalan_kutai);

        ImageView back = findViewById(R.id.BackButton1);

        back.setOnClickListener(V -> {
            startActivity(new Intent(prasasti_kutai.this, Menu.class));
        });
    }
}
