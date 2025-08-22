package com.example.reply.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AiScreen(
    modifier: Modifier = Modifier,
    greeting: String = "Effortless sign-in with Ohhpro AI",
    topCardAlpha: Float = 1f,
    onSwipeUp: () -> Unit,
    onSwipeDown: () -> Unit
) {
    val infiniteTransition = rememberInfiniteTransition(label = "gradient_animation")

    // Animate the rotation angle
    val rotationAngle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(8000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "rotation"
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(24.dp))
            .drawBehind { drawMovingGradientBorder(rotationAngle) }
    ) {
        AiScreenTopCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .align(Alignment.TopCenter)
                .alpha(topCardAlpha)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            onSwipeUp = onSwipeUp
        )
        Column(
            modifier = Modifier.statusBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = greeting,
                textAlign = TextAlign.Start,
                style = TextStyle(
                    fontSize = 36.sp,
                    fontWeight = FontWeight.ExtraBold,
                    brush = Brush.linearGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.primary,
                            MaterialTheme.colorScheme.secondary,
                            MaterialTheme.colorScheme.tertiary
                        )
                    )
                ),
                //color = MaterialTheme.colorScheme.onBackground, Not needed as we are using brush
                modifier = Modifier
                    .padding(top = 8.dp)
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.height(300.dp))
            Text(
                text = "What's up! Need any help?",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        AiScreenBottomCard (
            modifier = Modifier.align(Alignment.BottomCenter),
            onSwipeDown = onSwipeDown
        )
    }
}
