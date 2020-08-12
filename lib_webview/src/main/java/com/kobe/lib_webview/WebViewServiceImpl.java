package com.kobe.lib_webview;

import android.content.Context;
import android.content.Intent;


import com.google.auto.service.AutoService;
import com.kobe.lib_common.autoservice.IWebViewService;
import com.kobe.lib_webview.contants.Constants;
import com.kobe.lib_webview.ui.WebViewActivity;
import com.kobe.lib_webview.ui.WebViewFragment;

import androidx.fragment.app.Fragment;

@AutoService({IWebViewService.class})
public class WebViewServiceImpl implements IWebViewService {
    @Override
    public void startWebViewActivity(Context context, String url, String title, boolean isShowActionBar) {
        if (context != null) {
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra(Constants.TITLE, title);
            intent.putExtra(Constants.URL, url);
            intent.putExtra(Constants.IS_SHOW_ACTION_BAR, isShowActionBar);
            context.startActivity(intent);
        }
    }

    @Override
    public Fragment getWebViewFragment(String url, boolean canNativeRefresh) {
        return WebViewFragment.newInstance(url, canNativeRefresh);
    }
}
