package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class lofficielpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lofficielpdf);
        PDFView pdfView=findViewById(R.id.pdfviewlofficiel);
        pdfView.fromAsset("instyle.pdf").load();
    }
}