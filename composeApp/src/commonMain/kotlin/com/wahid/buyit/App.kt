package com.wahid.buyit

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider
import com.wahid.navigation.SetUpNavGraph
import com.wahid.shared.Constants

@Composable
@Preview
fun App() {


    MaterialTheme {
        SetUpNavGraph()
    }
}