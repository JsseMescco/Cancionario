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

public class Reggaeton extends AppCompatActivity {
    TextView txt1 ,txt2, txt3,txt4,txt5;
    ImageButton btn1,btn2,btn3,btn4,btn5;
    Button btnVolver, btnInfo;
    private MediaPlayer mp;
    String link ="https://historia-biografia.com/bad-bunny/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reggaeton);

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
                mp = MediaPlayer.create(Reggaeton.this, R.raw.rlndt);
                mp.start();
                Info1(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Reggaeton.this, R.raw.lazona);
                mp.start();
                Info2(view);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Reggaeton.this, R.raw.antesqueseacabe);
                mp.start();
                Info3(view);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Reggaeton.this, R.raw.malditapobreza);
                mp.start();
                Info4(view);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp = MediaPlayer.create(Reggaeton.this, R.raw.yonaguni);
                mp.start();
                Info5(view);
            }
        });
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                Intent intent = new Intent(Reggaeton.this, MainActivity.class);
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
        Toast.makeText(this, "Artista: Bad Bunny\n" +
                "Álbum: X 100pre\n" +
                "Fecha de lanzamiento: 2018", Toast.LENGTH_LONG).show();

    }
    public void Info2(View view) {
        Toast.makeText(this, "Artista: Bad Bunny\n" +
                "Álbum: YHLQMDLG\n" +
                "Fecha de lanzamiento: 2020", Toast.LENGTH_LONG).show();

    }
    public void Info3(View view) {
        Toast.makeText(this, "Artista: Bad Bunny\n" +
                "Álbum: El último tour del mundo\n" +
                "Fecha de lanzamiento: 2020", Toast.LENGTH_LONG).show();

    }
    public void Info4(View view) {
        Toast.makeText(this, "Artista: Bad Bunny\n" +
                "Álbum: El último tour del mundo\n" +
                "Fecha de lanzamiento: 2020", Toast.LENGTH_LONG).show();

    }
    public void Info5(View view) {
        Toast.makeText(this, "Artista: Bad Bunny\n" +
                "Álbum: El último tour del mundo\n" +
                "Fecha de lanzamiento: 2020", Toast.LENGTH_LONG).show();

    }
}