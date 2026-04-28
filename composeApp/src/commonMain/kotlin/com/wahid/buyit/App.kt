package com.wahid.buyit

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.wahid.navigation.SetUpNavGraph

@Composable
@Preview
fun App() {
    MaterialTheme {
        SetUpNavGraph()
    }
}