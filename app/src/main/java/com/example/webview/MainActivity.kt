package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var mainAct:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        mainAct=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainAct.root)

        try
        {
            mainAct.webview.webViewClient= WebViewClient()
            mainAct.webview.loadUrl("https://www.youtube.com/watch?v=L-Y_ZEWcpSM")
            mainAct.webview.settings.javaScriptEnabled=true
            mainAct.webview.settings.setSupportZoom(true)

        }catch (ex:Exception)
        {
            Toast.makeText(this,ex.message.toString(),Toast.LENGTH_SHORT).show()
        }

    }
}