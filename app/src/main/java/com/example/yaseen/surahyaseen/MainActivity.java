package com.example.yaseen.surahyaseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView arbi,guj,surah,eng;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arbi = findViewById(R.id.arabi);
        guj = findViewById(R.id.gujarati);
        eng = findViewById(R.id.english);
        surah = findViewById(R.id.surah_yaseen);

        surah.setText(R.string.surah_yaseen_arabi);


        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                surah.setText(R.string.surah_yaseen_english);
            }
        });
        arbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Toast.makeText(getApplicationContext(),"Build in Progress",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER,0,0);
               // t.show();
                System.out.println("Surah Yaseen  = "+R.string.surah_yaseen_arabi);
                surah.setText(R.string.surah_yaseen_arabi);
            }
        });

        guj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Toast.makeText(getApplicationContext(),"Build in Progress",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER,0,0);
                t.show();
            }
        });
    }
}
