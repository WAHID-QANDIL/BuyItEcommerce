package com.wahid.shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import buyitecommerce.shared.generated.resources.Res
import buyitecommerce.shared.generated.resources.bebas_neue_regular
import buyitecommerce.shared.generated.resources.roboto_condensed_variable_font_wght
import org.jetbrains.compose.resources.Font

@Composable
fun babesNeueFont() = Font(Res.font.bebas_neue_regular)

@Composable
fun robotoFont() = Font(Res.font.roboto_condensed_variable_font_wght)


object FontSize{
    val EXTRA_SMALL = 10.sp
    val SMALL = 12.sp
    val REGULAR = 14.sp
    val EXTRA_REGULAR = 16.sp
    val MEDIUM = 18.sp
    val EXTRA_MEDIUM = 20.sp
    val EXTRA_EXTRA_LARGE = 24.sp
    val LARGE = 32.sp
    val EXTRA_LARGE = 40.sp

}

