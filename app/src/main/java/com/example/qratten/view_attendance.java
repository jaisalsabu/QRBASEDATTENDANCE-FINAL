package com.example.qratten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class view_attendance extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attendance);
        webView=findViewById(R.id.webview);
        webView.loadUrl("https://intown-film.000webhostapp.com/welshschool.php");
    }
}
