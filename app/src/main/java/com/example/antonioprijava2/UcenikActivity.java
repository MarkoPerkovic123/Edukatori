package com.example.antonioprijava2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UcenikActivity extends AppCompatActivity {

    ImageView backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucenik2);

        backImg = findViewById(R.id.backImg);

        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UcenikActivity.this, PrijavaActivity.class);
                startActivity(intent);
            }
        });
    }
}