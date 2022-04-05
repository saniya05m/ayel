package com.example.ayelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ellepdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ellepdf);
        PDFView pdfView=findViewById(R.id.pdfviewelle);
        pdfView.fromAsset("189.pdf").load();
    }
}