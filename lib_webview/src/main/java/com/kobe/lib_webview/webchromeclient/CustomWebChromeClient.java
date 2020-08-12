package com.kobe.lib_webview.webchromeclient;

import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.kobe.lib_webview.callback.IWebViewCallBack;

public class CustomWebChromeClient extends WebChromeClient {
    private IWebViewCallBack mWebViewCallBack;
    private static final String TAG = "CustomWebChromeClient";

    public CustomWebChromeClient(IWebViewCallBack webViewCallBack) {
        this.mWebViewCallBack = webViewCallBack;
    }

    @Override
    public void onReceivedTitle(WebView view, String title) {
        if (mWebViewCallBack != null) {
            mWebViewCallBack.updateTitle(title);
        } else {
            Log.e(TAG, "WebViewCallBack is null.");
        }
    }

}
