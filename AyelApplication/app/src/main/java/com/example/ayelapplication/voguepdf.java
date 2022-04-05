package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class voguepdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voguepdf);
        PDFView pdfView=findViewById(R.id.pdfviewvogue);
        pdfView.fromAsset("vogue.pdf").load();
    }
}