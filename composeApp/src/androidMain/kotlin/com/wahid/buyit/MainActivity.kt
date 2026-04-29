package com.wahid.buyit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider
import com.wahid.shared.Constants

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        enableEdgeToEdge()
        GoogleAuthProvider.create(credentials = GoogleAuthCredentials(serverId = Constants.WEB_CLIENT_ID))
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}