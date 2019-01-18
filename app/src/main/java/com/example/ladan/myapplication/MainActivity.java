package com.example.ladan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    WebView webview;
    EditText et1;
    String atar;
    String a,b,c;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webview = (WebView)findViewById(R.id.webview);
        et1 = (EditText)findViewById(R.id.et1);
        webview.setWebViewClient(new WebViewClient());
        atar = "https://www.google.com/search?ei=ScVBXPrvG8_osAfg9oSoAQ&q="+a+".0x%5E2%2B"+b+".0x%2B"+c+".0&oq="+a+".0x%5E2%2B"+b+".0x%2B"+c+".0&gs_l=psy-ab.3...16731.20164..20660...0.0..0.155.898.0j6......0....1..gws-wiz.atHmGfc4cCc";
    }

    public void rrarara(View view) {
        if(i==0){
             a = et1.getText().toString();//mekadem x^2
             i++;
        }
        if(i==2){
             b = et1.getText().toString();//mekadem x
             i++;
        }
        else {
            c = et1.getText().toString();//mekadem hufshi
            i++;
        }atar = "https://www.google.com/search?ei=ScVBXPrvG8_osAfg9oSoAQ&q="+a+".0x%5E2%2B"+b+".0x%2B"+c+".0&oq="+a+".0x%5E2%2B"+b+".0x%2B"+c+".0&gs_l=psy-ab.3...16731.20164..20660...0.0..0.155.898.0j6......0....1..gws-wiz.atHmGfc4cCc";
        }

    public void mekadem(View view) {
        webview.loadUrl(atar);
    }

    public void restart(View view) {
        i=0;
    }
}

