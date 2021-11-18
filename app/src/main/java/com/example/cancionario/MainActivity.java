package com.example.cancionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnSalsa , btnRock ,btnCumbia, btnHiphop, btnReggaeton, btnPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCumbia = findViewById(R.id.btCumbia);
        btnRock = findViewById(R.id.btRock);
        btnReggaeton = findViewById(R.id.btReggaeton);
        btnHiphop = findViewById(R.id.btHiphop);
        btnPop = findViewById(R.id.btPop);
        btnSalsa = findViewById(R.id.btSalsa);


        btnCumbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cumbia.class);
                startActivity(intent);
            }
        });
        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Rock.class);
                startActivity(intent);
            }
        });
        btnReggaeton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Reggaeton.class);
                startActivity(intent);
            }
        });
        btnHiphop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hiphop.class);
                startActivity(intent);
            }
        });
        btnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pop.class);
                startActivity(intent);
            }
        });
        btnSalsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Salsa.class);
                startActivity(intent);
            }
        });
    }
}