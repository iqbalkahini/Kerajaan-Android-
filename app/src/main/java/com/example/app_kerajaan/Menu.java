package com.example.app_kerajaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        ImageView aceh = findViewById(R.id.imageView5);
        ImageView singosari = findViewById(R.id.imageView2);
        ImageView bali = findViewById(R.id.imageView6);
        ImageView demak = findViewById(R.id.imageView7);
        ImageView kutai = findViewById(R.id.imageView8);
        ImageView majapahit = findViewById(R.id.imageView9);
        ImageView mataram = findViewById(R.id.imageView10);
        ImageView sriwijaya = findViewById(R.id.imageView11);
        ImageView tarumanegara = findViewById(R.id.imageView12);
        ImageView credit = findViewById(R.id.imageView13);

        aceh.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailAceh.class));
        });
        singosari.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailSingosari.class));
        });
        bali.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailBali.class));
        });
        demak.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailDemak.class));
        });
        kutai.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailKutai.class));
        });
        majapahit.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailMajapahit.class));
        });
        mataram.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailMataram.class));
        });
        sriwijaya.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailSriwijaya.class));
        });
        tarumanegara.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailTarumanegara.class));
        });
        credit.setOnClickListener(V -> {
            startActivity(new Intent(Menu.this, DetailCredit.class));
        });
    }
}