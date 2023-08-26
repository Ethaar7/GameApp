package com.example.gameapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gamegate.theme.pridi
import com.example.gamegate.theme.text37
import com.example.gamegate.theme.text60
import com.example.gamegate.theme.text87

val Typography = Typography(

    titleMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = pridi,
        fontWeight = FontWeight.Medium,
        color = text87,
    ),
    titleLarge = TextStyle(
        fontSize = 18.sp,
        fontFamily = pridi,
        fontWeight = FontWeight.SemiBold,
        color = text87,
    ),
    bodySmall = TextStyle(
        fontSize = 10.sp,
        fontFamily = pridi,
        fontWeight = FontWeight.Normal,
        color = text37,
    ),
    bodyMedium = TextStyle(
        fontSize = 12.sp,
        fontFamily = pridi,
        fontWeight = FontWeight.Normal,
        color = text87,
    ),
    labelMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = pridi,
        fontWeight = FontWeight.Medium,
        color = text60,
    )

)

