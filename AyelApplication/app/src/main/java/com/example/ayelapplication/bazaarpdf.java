package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bazaarpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazaarpdf);
        PDFView pdfView=findViewById(R.id.pdfviewbazaar);
        pdfView.fromAsset("bazaar.pdf").load();
    }
}