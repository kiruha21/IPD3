@file:Suppress("DEPRECATION")

package com.yarashevich.kiryl.ipd

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * Created by kiril on 04.12.2016.
 */

class Nav_A : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this@Nav_A)
        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls = true
        webView.settings.displayZoomControls = false
        webView.settings.pluginState = WebSettings.PluginState.ON

        //---you need this to prevent the webview from
        // launching another browser when a url
        // redirection occurs-—
        webView.webViewClient = Callback()

        val pdfURL = "http://www.uoipd.by/files/files/studentu/raspisanie/dnevnoe/1kurs.pdf"
        webView.loadUrl(
                "http://docs.google.com/gview?embedded=true&url=" + pdfURL)

        setContentView(webView)
    }

    private inner class Callback : WebViewClient() {
        override fun shouldOverrideUrlLoading(
                view: android.webkit.WebView, url: String): Boolean {
            return false
        }
    }


}
