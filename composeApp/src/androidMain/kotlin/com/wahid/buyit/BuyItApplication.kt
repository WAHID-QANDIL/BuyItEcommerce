package com.wahid.buyit

import android.app.Application
import com.google.firebase.FirebaseApp
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider
import com.wahid.shared.Constants

class BuyItApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

    }
}