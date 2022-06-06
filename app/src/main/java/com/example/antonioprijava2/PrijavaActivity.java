package com.example.antonioprijava2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrijavaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prijava);

        Button button = (Button) findViewById(R.id.prijavaButton);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        button.setOnClickListener(v -> {
            String usernameT = username.getText().toString();
            String passwordT = password.getText().toString();

            if(usernameT.equals("Ucenik") && passwordT.equals("sifra")){
                Intent intent = new Intent(PrijavaActivity.this, UcenikActivity.class);
                startActivity(intent);
            }
        });

    }
}