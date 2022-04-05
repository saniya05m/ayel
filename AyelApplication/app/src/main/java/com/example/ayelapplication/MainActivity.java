package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magazines_layout);
        openMainWindow();

    }
    private void openMainWindow(){
        Button secretButton=(Button) findViewById(R.id.buttonSecret);
        ImageButton vogueButton=(ImageButton) findViewById(R.id.imageButtonVogue);
        ImageButton bazaarButton=(ImageButton) findViewById(R.id.imageButtonHarpers);
        ImageButton elleButton=(ImageButton) findViewById(R.id.imageButtonElle);
        ImageButton forbesButton=(ImageButton) findViewById(R.id.imageButtonForbes);
        ImageButton cosmopolitanButton=(ImageButton) findViewById(R.id.imageButtonCosmopolitan);
        ImageButton glamourButton=(ImageButton) findViewById(R.id.imageButtonGlamour);
        ImageButton gqButton=(ImageButton) findViewById(R.id.imageButtonGQ);
        ImageButton marieclaireButton=(ImageButton) findViewById(R.id.imageButtonMarieClaire);
        ImageButton loficielButton=(ImageButton) findViewById(R.id.imageButtonLofficiel);

        vogueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, voguepdf.class));
            }
        });
        secretButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainWindow.class));

            }
        });
        bazaarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, bazaarpdf.class));
            }
        });
        elleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ellepdf.class));
            }
        });
        cosmopolitanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, cosmopolitanpdf.class));
            }
        });
        glamourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, glamourpdf.class));
            }
        });
        gqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, gqpdf.class));
            }
        });
        marieclaireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, marieclairepdf.class));
            }
        });
        loficielButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, lofficielpdf.class));
            }
        });
        forbesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, forbespdf.class));
            }
        });
    }
}