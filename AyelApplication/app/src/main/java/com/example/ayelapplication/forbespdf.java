package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class forbespdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forbespdf);
        PDFView pdfView=findViewById(R.id.pdfviewforbes);
        pdfView.fromAsset("forbes.pdf").load();
    }
}