package com.yarashevich.kiryl.ipd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Kiruha_21 on 10.11.2017.
 */

public class Zaochnoe_D extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(Zaochnoe_D.this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

//---you need this to prevent the webview from
// launching another browser when a url
// redirection occurs-—
        webView.setWebViewClient(new Callback());

        String pdfURL = "http://www.uoipd.by/files/files/studentu/raspisanie/zaochnoe/Raspisanie_2k_poln_srok_s_09.10_po_28.10.2017.pdf";
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