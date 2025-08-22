package com.example.reply.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp
import kotlin.div
import kotlin.math.cos
import kotlin.math.sin
import kotlin.times

fun DrawScope.drawMovingGradientBorder(rotationAngle: Float) {
    val borderWidth = 2.dp.toPx()
    val radius = 24.dp.toPx()

    val centerX = size.width / 2
    val centerY = size.height / 2

    val colors = listOf(
        Color(0xFFedbcdc),
        Color(0xFFc8a8f3),
        Color(0xFF7C3AED),
        Color(0xFFafdfdd)
    )

    // Calculate gradient positions based on rotation
    val angleRad = Math.toRadians(rotationAngle.toDouble())
    val gradientRadius = maxOf(size.width, size.height) * 0.7f

    val startX = centerX + (gradientRadius * cos(angleRad)).toFloat()
    val startY = centerY + (gradientRadius * sin(angleRad)).toFloat()
    val endX = centerX - (gradientRadius * cos(angleRad)).toFloat()
    val endY = centerY - (gradientRadius * sin(angleRad)).toFloat()

    val brush = Brush.linearGradient(
        colors = colors,
        start = Offset(startX, startY),
        end = Offset(endX, endY)
    )

    // Draw the gradient border
    drawRoundRect(
        brush = brush,
        topLeft = Offset.Zero,
        size = size,
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(radius)
    )

    // Draw inner black rectangle to create border effect
    drawRoundRect(
        color = Color(0xff000000),
        topLeft = Offset(borderWidth, borderWidth),
        size = androidx.compose.ui.geometry.Size(
            size.width - borderWidth * 2,
            size.height - borderWidth * 2
        ),
        cornerRadius = CornerRadius(radius - borderWidth)
    )
}