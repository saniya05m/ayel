package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class marieclairepdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marieclairepdf);
        PDFView pdfView=findViewById(R.id.pdfviewmarieclaire);
        pdfView.fromAsset("marieclaire.pdf").load();
    }
}