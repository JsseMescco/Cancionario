package com.example.cancionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Cumbia extends AppCompatActivity {
    TextView txt1, txt2, txt3, txt4, txt5;
    ImageButton btn1, btn2, btn3, btn4, btn5;
    ImageView im1;
    private MediaPlayer mp1;
    Button btnvolver, btnInfo;
    String link = "https://adonde.com/biografia/grupo5.php#:~:text=El%20Grupo%205%20fue%20creado,musical%20llamado%20\"Grupo%205\".&text=Su%20música%20ya%20se%20escucha%20en%20las%20radios%20del%20Perú.";
    private String nose = "";
    private static Cumbia instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cumbia);
        instance = this;
        im1 = findViewById(R.id.imageView3);
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
        btnvolver = findViewById(R.id.btVolver);
        btnInfo = findViewById(R.id.btInfo);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp1 = MediaPlayer.create(Cumbia.this, R.raw.grupo51);
                mp1.start();
                Info1(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp1 = MediaPlayer.create(Cumbia.this, R.raw.grupo52);
                mp1.start();
                Info2(view);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp1 = MediaPlayer.create(Cumbia.this, R.raw.grupo53);
                mp1.start();
                Info3(view);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp1 = MediaPlayer.create(Cumbia.this, R.raw.grupo54);
                mp1.start();
                Info4(view);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                mp1 = MediaPlayer.create(Cumbia.this, R.raw.grupo55);
                mp1.start();
            }
        });
        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                Intent intent = new Intent(Cumbia.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
    }

    private void stopPlaying() {
        if (mp1 != null) {
            mp1.stop();
            mp1.release();
            mp1 = null;
        }
    }
    public void Info1(View view) {
        Toast.makeText(this, "Artista: Grupo 5\n" +
                "Álbum: Boleros & Baladas: Peruvians Sing For The Brokenhearted\n" +
                "Fecha de lanzamiento: 1973", Toast.LENGTH_LONG).show();

    }
    public void Info2(View view) {
        Toast.makeText(this, "Artista: Grupo 5\n" +
                "Álbum: Boleros & Baladas: Peruvians Sing For The Brokenhearted\n" +
                "Fecha de lanzamiento: 1973", Toast.LENGTH_LONG).show();

    }
    public void Info3(View view) {
        Toast.makeText(this, "Artista: Grupo 5\n" +
                "Álbum: Motor y Motivo\n" +
                "Fecha de lanzamiento: 2005", Toast.LENGTH_LONG).show();

    }
    public void Info4(View view) {
        Toast.makeText(this, "Artista: Grupo 5\n" +
                "Álbum: Motor y Motivo\n" +
                "Fecha de lanzamiento: 2005", Toast.LENGTH_LONG).show();

    }
    public void Info5(View view) {
        Toast.makeText(this, "Artista: Grupo 5\n" +
                "Álbum: Viva el Amor\n" +
                "Fecha de lanzamiento: 1994", Toast.LENGTH_LONG).show();

    }
}