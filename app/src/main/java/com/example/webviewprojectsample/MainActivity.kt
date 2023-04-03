package com.example.webviewprojectsample

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.webkit.WebViewClient
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        webView.webViewClient = WebViewClient()

        //this will load the url of the website
        webView.loadUrl("https://sites.google.com/view/pkads/")
        FirebaseMessaging.getInstance().getToken()
//            .addOnCompleteListener(new OnCompleteListener<String>() {
//                @Override
//                public void onComplete(@NonNull Task<String> task) {
//                    if (!task.isSuccessful()) {
//                        System.out.println("Fetching FCM registration token failed");
//                        return;
//                    }
//                }
//                //Get new FCM registration token
//                String token = task.getResult();
//
//                //log and toast
//                System.out.println(token);
//            }


//            )

        //this will enable the javascript settings, it can also xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        //if you want to enable the zoom feature
        webView.settings.setSupportZoom(true)
    }

    //if you press Back button this code will work
    override fun onBackPressed()  {
        //if your webview can go back it will go back
        if (webView.canGoBack())
            webView.goBack()
        //if your webview cannot go back
        //it will exit the application

        else
            super.onBackPressed()

    }



}