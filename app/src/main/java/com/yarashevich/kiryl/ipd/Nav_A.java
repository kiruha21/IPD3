package com.yarashevich.kiryl.ipd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

/**
 * Created by kiril on 04.12.2018.
 */

public class Nav_A extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.webkit.WebView webView = new android.webkit.WebView(Nav_A.this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

//---you need this to prevent the webview from
// launching another browser when a url
// redirection occurs-—
        webView.setWebViewClient(new Callback());

        String pdfURL = "http://www.uoipd.by/files/files/studentu/raspisanie/dnevnoe/1kurs.pdf";
        webView.loadUrl(
                "http://docs.google.com/gview?embedded=true&url=" + pdfURL);

        setContentView(webView);
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                android.webkit.WebView view, String url) {
            return (false);
        }
    }


}
