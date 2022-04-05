package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class glamourpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glamourpdf);
        PDFView pdfView=findViewById(R.id.pdfviewglamour);
        pdfView.fromAsset("glamour.pdf").load();
    }
}