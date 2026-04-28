package com.wahid.auth.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.wahid.shared.Dimin
import com.wahid.shared.FontSize
import com.wahid.shared.GrayDark
import com.wahid.shared.GrayLight
import com.wahid.shared.Orange
import com.wahid.shared.Resources
import com.wahid.shared.TextPrimary
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource


@Composable
fun GoogleButton(
    modifier: Modifier = Modifier,
    onClicked: () -> Unit,
    loadingState: Boolean = false,
    primaryText: String = "Sign in with google",
    secondaryText: String = "Please wait...",
    icon: DrawableResource = Resources.Images.GoogleLogo,
    shape: Shape = RoundedCornerShape(size = Dimin.Corner.FULL_CORNER),
    backgroundColor: Color = GrayLight,
    borderColor: Color = GrayDark,
    borderStrokeWidth: Dp = 1.dp,
    progressIndicatorColor: Color = Orange,
    iconColor: Color = Color.Unspecified
) {

    val buttonText by remember { derivedStateOf { if (loadingState) secondaryText else primaryText } }

    Surface(
        modifier = modifier
            .clip(shape = shape)
            .border(
                width = borderStrokeWidth,
                color = borderColor,
                shape = shape
            ).clickable(enabled = !loadingState, onClick = onClicked),
        color = backgroundColor
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(all = Dimin.Padding.LARGE_PADDING)
                .animateContentSize(animationSpec = tween(durationMillis = 200)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            AnimatedVisibility(!loadingState) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = "Google Logo",
                    tint = iconColor
                )
            }
            Spacer(modifier = Modifier.width(Dimin.Padding.REGULAR_PADDING))
            AnimatedVisibility(loadingState) {
                CircularProgressIndicator(
                    modifier = Modifier.size(Dimin.Padding.LARGE_PADDING),
                    strokeWidth = 2.dp,
                    color = progressIndicatorColor
                )
            }
            Spacer(modifier = Modifier.width(Dimin.Padding.REGULAR_PADDING))
            Text(
                text = buttonText,
                color = TextPrimary,
                textAlign = TextAlign.Center,
                fontSize = FontSize.REGULAR
            )


        }


    }


}