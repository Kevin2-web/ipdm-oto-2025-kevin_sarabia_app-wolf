package com.example.appwolf.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF8E24AA),
    secondary = Color(0xFFD81B60),
    background = Color(0xFFF3E5F5),
    surface = Color(0xFFF8BBD0),
    onPrimary = Color.White
)

@Composable
fun AppWolfTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}
