package com.wahid.auth

import ContentWithMessageBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import com.wahid.auth.component.GoogleButton
import com.wahid.shared.Alpha
import com.wahid.shared.Dimin
import com.wahid.shared.FontSize
import com.wahid.shared.Orange
import com.wahid.shared.TextPrimary
import com.wahid.shared.White
import com.wahid.shared.babesNeueFont
import rememberMessageBarState

@Composable
fun AuthScreen() {
    val messageBarState = rememberMessageBarState()
    var isLoading by remember { mutableStateOf(false) }
    Scaffold { paddingValues ->

        ContentWithMessageBar(
            contentBackgroundColor = White,
            messageBarState = messageBarState,
            modifier = Modifier.padding(
                top = paddingValues.calculateTopPadding(),
                bottom = paddingValues.calculateBottomPadding()
            ),
            errorMaxLines = 2,
        ) {

            Column(
                modifier = Modifier.fillMaxSize()
            ) {


                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "BUYIT",
                        textAlign = TextAlign.Center,
                        fontFamily = babesNeueFont(),
                        fontSize = FontSize.EXTRA_LARGE,
                        color = Orange
                    )

                    Text(
                        modifier = Modifier.fillMaxWidth().alpha(
                            alpha = Alpha.HALF
                        ),
                        text = "Welcome to BuyIt\nSign in to continue",
                        textAlign = TextAlign.Center,
                        fontSize = FontSize.EXTRA_REGULAR,
                        color = TextPrimary
                    )

                }

                GoogleButton(
                    modifier = Modifier.padding(Dimin.Padding.REGULAR_PADDING),
                    onClicked = {
                        messageBarState.addError("Something went wrong")
                        isLoading = isLoading.not()
                    },
                    loadingState = isLoading,
                )
            }


        }

    }
}