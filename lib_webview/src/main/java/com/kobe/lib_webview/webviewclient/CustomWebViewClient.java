package com.kobe.lib_webview.webviewclient;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kobe.lib_webview.callback.IWebViewCallBack;


public class CustomWebViewClient extends WebViewClient {
    private IWebViewCallBack mWebViewCallBack;
    private static final String TAG = "CustomWebViewClient";

    public CustomWebViewClient(IWebViewCallBack callBack) {
        this.mWebViewCallBack = callBack;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        if (mWebViewCallBack != null) {
            mWebViewCallBack.onPageStarted(url);
        } else {
            Log.e(TAG, "WebViewCallBack is null.");
        }
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        if (mWebViewCallBack != null) {
            mWebViewCallBack.onPageFinished(url);
        } else {
            Log.e(TAG, "WebViewCallBack is null.");
        }
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        if (mWebViewCallBack != null) {
            mWebViewCallBack.onError();
        } else {
            Log.e(TAG, "WebViewCallBack is null.");
        }
    }
}
