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

public class Rock extends AppCompatActivity {
    TextView txt1 ,txt2, txt3,txt4,txt5;
    ImageButton btn1,btn2,btn3,btn4,btn5;
    private  MediaPlayer mp;
    Button btnVolver, btnInfo;
    String link = "https://historia-biografia.com/historia-de-queen/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
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
                mp = MediaPlayer.create(Rock.this, R.raw.queen1);
                mp.start();
                Info1(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Rock.this, R.raw.queen2);
                mp.start();
                Info2(view);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Rock.this, R.raw.queen3);
                mp.start();
                Info3(view);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Rock.this, R.raw.queen4);
                mp.start();
                Info4(view);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Rock.this, R.raw.queen5);
                mp.start();
                Info5(view);
            }
        });
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                Intent intent = new Intent(Rock.this, MainActivity.class);
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
        Toast.makeText(this, "Artista: Queen\n" +
                "Película musical: Bohemian Rhapsody: la historia de Freddie Mercury\n" +
                "Año de Lanzamiento : 1979", Toast.LENGTH_LONG).show();

    }
    public void Info2(View view) {
        Toast.makeText(this, "Artista: Queen\n" +
                "Álbum: A Night at the Opera\n" +
                "Fecha de lanzamiento: 1975", Toast.LENGTH_LONG).show();

    }
    public void Info3(View view) {
        Toast.makeText(this, "Artista: Queen\n" +
                "Álbum: News of the World\n" +
                "Fecha de lanzamiento: 1977\n" +
                "Género: Rock", Toast.LENGTH_LONG).show();

    }
    public void Info4(View view) {
        Toast.makeText(this, "Artista: Queen\n" +
                "Álbum: News of the World\n" +
                "Fecha de lanzamiento: 1977\n" +
                "Género: Rock", Toast.LENGTH_LONG).show();

    }
    public void Info5(View view) {
        Toast.makeText(this, "Artista: Queen\n" +
                "Álbum: The Works\n" +
                "Fecha de lanzamiento: 1984\n" +
                "Nominaciones: Premio Brit al Mejor Álbum Británico, MTV Video Music Award a la Mejor Dirección de Arte en un Video", Toast.LENGTH_LONG).show();

    }
}