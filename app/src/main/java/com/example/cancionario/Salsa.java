package com.example.cancionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class Salsa extends AppCompatActivity {
    TextView txt1 ,txt2, txt3,txt4,txt5;
    ImageButton btn1,btn2,btn3,btn4,btn5;
    private MediaPlayer mp;
    Button btnVolver, btnInfo;
    String link = "https://historia-biografia.com/hector-lavoe/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salsa);
        btn1 = findViewById(R.id.imageButton1);
        btn2 = findViewById(R.id.imageButton2);
        btn3 = findViewById(R.id.imageButton3);
        btn4 = findViewById(R.id.imageButton4);
        btn5 = findViewById(R.id.imageButton5);
        txt1 = findViewById(R.id.textView1);
        txt2 = findViewById(R.id.textView2);
        txt3 = findViewById(R.id.textView3);
        txt4 = findViewById(R.id.textView4);
        txt5 = findViewById(R.id.textView5);
        btnVolver = findViewById(R.id.btVolver);
        btnInfo = findViewById(R.id.btInfo);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Salsa.this, R.raw.salsa1);
                mp.start();
                Info1(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Salsa.this, R.raw.salsa2);
                mp.start();
                Info2(view);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Salsa.this, R.raw.salsa3);
                mp.start();
                Info3(view);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Salsa.this, R.raw.salsa4);
                mp.start();
                Info4(view);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Salsa.this, R.raw.salsa5);
                mp.start();
                Info5(view);
            }
        });
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                Intent intent = new Intent(Salsa.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);
            }
        });
    }
    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    public void Info1(View view) {
        Toast.makeText(this, "Artistas: Héctor Lavoe, Willie Colón\n" +
                "Álbum: Vigilante\n" +
                "Fecha de lanzamiento: 1983", Toast.LENGTH_LONG).show();

    }
    public void Info2(View view) {
        Toast.makeText(this, "Artistas: Héctor Lavoe, Willie Colón\n" +
                "Álbum: Vigilante\n" +
                "Fecha de lanzamiento: 1983", Toast.LENGTH_LONG).show();

    }
    public void Info3(View view) {
        Toast.makeText(this, "Artista: Héctor Lavoe\n" +
                "Álbum: De ti depende\n" +
                "Fecha de lanzamiento: 1976", Toast.LENGTH_LONG).show();

    }
    public void Info4(View view) {
        Toast.makeText(this, "Artista: Héctor Lavoe\n" +
                "Álbum: De ti depende\n" +
                "Fecha de lanzamiento: 1976", Toast.LENGTH_LONG).show();

    }
    public void Info5(View view) {
        Toast.makeText(this, "Artista: Héctor Lavoe\n" +
                "Álbum: Comedia\n" +
                "Fecha de lanzamiento: 1978\n" +
                "Género: Salsa y música tropical", Toast.LENGTH_LONG).show();

    }
}