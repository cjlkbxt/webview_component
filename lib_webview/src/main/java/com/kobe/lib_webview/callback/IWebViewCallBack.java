package com.kobe.lib_webview.callback;

public interface IWebViewCallBack {
    void onPageStarted(String url);

    void onPageFinished(String url);

    void onError();

    void updateTitle(String title);
}
