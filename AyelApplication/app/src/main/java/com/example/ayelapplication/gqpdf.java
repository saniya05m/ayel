package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class gqpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gqpdf);
        PDFView pdfView=findViewById(R.id.pdfviewgq);
        pdfView.fromAsset("gq.pdf").load();
    }
}