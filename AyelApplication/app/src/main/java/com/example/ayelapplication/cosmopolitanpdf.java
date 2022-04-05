package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cosmopolitanpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmopolitanpdf);
        PDFView pdfView=findViewById(R.id.pdfviewcosmopolitan);
        pdfView.fromAsset("cosmopolitan.pdf").load();
    }
}