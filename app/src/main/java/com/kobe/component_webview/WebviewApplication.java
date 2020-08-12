package com.kobe.component_webview;


import com.kingja.loadsir.core.LoadSir;
import com.kobe.lib_base.BaseApplication;
import com.kobe.lib_base.loadsir.CustomCallback;
import com.kobe.lib_base.loadsir.EmptyCallback;
import com.kobe.lib_base.loadsir.ErrorCallback;
import com.kobe.lib_base.loadsir.LoadingCallback;
import com.kobe.lib_base.loadsir.TimeoutCallback;

public class WebviewApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        LoadSir.beginBuilder()
                .addCallback(new ErrorCallback())
                .addCallback(new EmptyCallback())
                .addCallback(new LoadingCallback())
                .addCallback(new TimeoutCallback())
                .addCallback(new CustomCallback())
                .setDefaultCallback(LoadingCallback.class)
                .commit();
    }
}
