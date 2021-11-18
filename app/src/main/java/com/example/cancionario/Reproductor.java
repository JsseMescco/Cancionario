package com.example.cancionario;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Reproductor extends AppCompatActivity {
    Button btnplay, btnpausa, btnstop,btnVolver;
    TextView txtInfo, txttiempo;
    SeekBar sb;
    private MediaPlayer mp1;
    ImageView imagen;
    private int tiempoactual = 0;
    private int tiempototal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);
        btnplay = findViewById(R.id.btPlay);
        btnpausa = findViewById(R.id.btPause);
        btnstop = findViewById(R.id.btStop);
        btnVolver = findViewById(R.id.btVolver);
        txttiempo = findViewById(R.id.tvTiempo);
        txtInfo = findViewById(R.id.tvTitulo);
        imagen = findViewById(R.id.ivPortada);
        sb = findViewById(R.id.seekBar);
    }
}