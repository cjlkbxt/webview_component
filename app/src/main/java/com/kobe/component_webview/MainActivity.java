package com.kobe.component_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.kobe.lib_base.autoservice.BaseServiceLoader;
import com.kobe.lib_common.autoservice.IWebViewService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_open_webview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IWebViewService webviewService = BaseServiceLoader.load(IWebViewService.class);
                if(webviewService != null) {
                    webviewService.startWebViewActivity(MainActivity.this, "https://www.baidu.com", "百度", true);
                }
            }
        });
    }
}