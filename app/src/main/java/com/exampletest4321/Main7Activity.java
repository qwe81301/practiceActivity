package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        WebView webview =  findViewById(R.id.webView);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);//這行要加 試過拿掉 會出錯
        webview.setWebViewClient(new WebViewClient());
//        webview.loadUrl("https://jerrynest.io/");
        String web1= "http://192.168.1.195/lightBox/ResumeDetail.aspx?Row=aa997479-14d2-4047-96b0-c02dbc812a83&Snap=94c82160-5a72-46cf-9a9f-ac03a237e3f2&role=1&tNo=52407601&rNo=3000999&ref=rPoolActive&vrS=1&eNo=85849114";
        String web2= "http://192.168.1.234/17SP/6263test/20190606_resume-preview/resume-preview.htm";
        webview.loadUrl(web1);

    }
}
