package com.example.madactivitymoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WebActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        webView = findViewById(R.id.webView);
        // Overriding URL Load based on the type of link (tel: OR mailto:)
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("tel:")) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
                    startActivity(intent);
                    return true;
                }
                else if (url.startsWith("mailto:")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    return true;
                }
                else {
                    view.loadUrl(url);
                    return true;
                }
            }
        });

        // Loading URL by default
        webView.loadUrl("https://99bookstores.com/p/about-us/");

        // Enable JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.getJavaScriptEnabled();
    }

    // Can go back to previous pages using Back Button (provided they are in stack)
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        }
    }
}
