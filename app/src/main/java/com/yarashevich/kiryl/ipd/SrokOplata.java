package com.yarashevich.kiryl.ipd;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

/**
 * Created by kiril on 15.02.2018.
 */

public class SrokOplata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(SrokOplata.this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);

//---you need this to prevent the webview from
// launching another browser when a url
// redirection occurs-—
        webView.setWebViewClient(new Callback());

        String pdfURL = "http://personalcode.at.ua/ipd_files/oplata.pdf";
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
